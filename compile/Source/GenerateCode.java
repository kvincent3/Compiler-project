import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
/*
 * R1 est réservé pour les calcul
 */

public class GenerateCode 
{
	Tree astree;
	String nameFile;
	private ArrayList<FonctionRegion> fonctions = new ArrayList<FonctionRegion>();
	private Pro pile;
	boolean trouver;
	String codeFunction="";
	public GenerateCode(Tree ast,Pro pile)
	{
		this.pile=pile;
		this.astree=ast;
		this.createFile();
		this.generate(this.astree,0,0);
	}

	private void generate(Tree ast ,int region,int mode) 
	{
		if (ast.getText().equals("do"))
		{
			this.WriteInFile("sp          equ r15\nwr          equ r14\nbp          equ r13", mode);
			this.WriteInFile("SP          equ r15\nWR          equ r14\nBP          equ r13", mode);
			this.WriteInFile("D1    	  equ r1\n", mode);
			this.WriteInFile("EXIT_EXC   EQU   64 \nREAD_EXC   EQU   65\nWRITE_EXC  EQU   66", mode );
			this.WriteInFile("\n", mode);
			this.WriteInFile("NUL         equ  0\nNULL        equ  0 \nNIL         equ  0  ", mode);
			this.WriteInFile("\n", mode);
			this.WriteInFile("STACK_ADRS  equ 0x1000 \nLOAD_ADRS   equ 0xFE00  \norg LOAD_ADRS\nstart do\n", mode);
			this.WriteInFile("do ldw SP, #STACK_ADRS", mode);
			this.WriteInFile("ldw bp, #NIL", mode);
			this.WriteInFile("stw BP, -(SP)", mode);
			this.WriteInFile("ldw BP, SP", mode);
			generate(ast.getChild(0),0,0);
			generate(ast.getChild(1),0,0);
			generate(ast.getChild(2), 0,0);
		}
		else
		{

			if (ast.getText().equals("DECLARATION"))
			{
				for (int i=0;i<ast.getChildCount();i++)
				{
					if (ast.getChild(i).getText().equals("VAR"))
					{
						if (ast.getChild(i).getChild(0).getText().equals("integer"))// on donne deux octets pour les entier
						{
							this.WriteInFile("adi sp, sp, #-2", mode);				
						}

					}
				}
			}
			if (ast.getText().equals("INSTRUCTION"))
			{

				for (int i=0;i<ast.getChildCount();i++)
				{
					if (ast.getChild(i).getText().equals("="))
					{
						this.operate(ast.getChild(i).getChild(1),null, mode);
						//int entier = Integer.parseInt(ast.getChild(i).getChild(1).getText());
						//this.WriteInFile("ldw r0, #"+entier);
						///this.WriteInFile("stw r0, (bp)-2");
					}
					else if(ast.getChild(i).getText().equals("WRITE"))
					{
						//this.WriteInFile("ldw r0, #10\nstw r0, -(sp)\nadi bp, r0, #-8\nstw r0, -(sp)\nldw r0, (bp)-10\nstw r0, -(sp)\n");
						//this.WriteInFile("jsr @itoa_");
						//this.WriteInFile("adi bp, r0, #-2");
						//this.WriteInFile("stw r0, -(sp)");
						//this.WriteInFile("jsr @print_");
						//this.WriteInFile("ldq ASCII_0, r0");
						//this.WriteInFile("TRP #WRITE_EXC");
					}
					else if (ast.getChild(i).getText().equals("APPEL"))
					{
						function(ast.getChild(i),region, mode);
					}
				}
			}
			if (ast.getText().equals("BLOC"))
			{
				generate(ast.getChild(0),region,mode);//pour les déclarations d'une fonction
				generate(ast.getChild(1),region,mode);//pour les intructions d'une fonction
			}
			if (ast.getText().equals("end"))
			{
				this.WriteInFile("ldw sp, bp \n ldw bp, (sp)+\ntrp #EXIT_EXC\n", mode);
				this.WriteInFile("\n\n", mode);
				for (int i=0;i<this.fonctions.size();i++)
				{
					this.WriteInFile(fonctions.get(i).getCodeFonction(), 0);
					this.WriteInFile("\n\n\n",0);
					System.out.println(i+"\n");
					System.out.println(fonctions.get(i).getCodeFonction());
				}
			}
		}

	}

	private void function(Tree ast,int regionAppelant,int mode) 
	{
		//pour l'instant on ne gère que les entiers
		String nomFonction= ast.getChild(0).getText();
		FonctionRegion a = new FonctionRegion(nomFonction,regionAppelant);
		ArrayList<Integer> region_ouvertes=this.pile.getPile().get(regionAppelant);
		this.trouver=false;//cette variable dit si on a trouvé ou pas la fonction
		//on doit chercher le code de cette fonction
		for(int j=region_ouvertes.size()-1;j>=0;j--)
		{
			
			if (!this.trouver)
			{
			  SearchInAst(this.astree,0,region_ouvertes.get(j),a);
			}
			else
			{
				break;
			}
		}
		a.setCodeFonction(this.codeFunction);
		this.fonctions.add(a);
		this.codeFunction="";// on remet a jour codefunction pour pouvoir l'utiliser pour une autre 
		// on empile les paramètres
		if (ast.getChildCount()>1)// si la fonction à des paramètres
		{	//on met chaque paramètre dans r0 puis on empile
			for (int i=1;i<ast.getChildCount();i++)
			{
				if (isNumeric(ast.getChild(i).getText()))//si le paramètre est un entier
				{
					this.WriteInFile("ldw r0, #"+ast.getChild(i).getText(), mode);//on met dans r0
					this.WriteInFile("stw r0, -(sp)", mode);//on empile
				}
			}
			//maintenant on calcul le chainage statique que l'on range dans r2
			//on charge Bp dans r1
			this.WriteInFile("ldw r1,bp", mode);
			//on soustrait 4 à r1 pour retrouver notre chainage statique
			this.WriteInFile("adq -4, r1", mode);
			// on prend le chainage statique associé pouis on le stock dans r2
			this.WriteInFile("ldw r2,(r1)", mode);
			//on fait le jsr
			this.WriteInFile("jsr @"+nomFonction+"_", mode);
			//après l'appel on dépile les paramètres
			this.WriteInFile("adi sp, sp, #"+(ast.getChildCount()-1)*2, mode);
		}
	}

	private void SearchInAst(Tree a,int region_ast/*region que l'on incrémente pour le parcours*/,int region_a_trouver, FonctionRegion fonc)//on va chercher dans l'ast -> regionAppelant 
	{
		if (region_a_trouver==region_ast)
		{
			//chercher a.getNomfonction dans la declaration
			if (region_a_trouver==0)
			{
				int calculNextRegion=1;
				for (int i=0;i<a.getChild(0).getChildCount();i++)
				{
					//System.out.println(a.getChild(0).getChild(i));
					
					//System.out.println(calculNextRegion);
					if (a.getChild(0).getChild(i).getText().equals("FONCTION")
						/*on verra pour les procédures après || a.getChild(0).getChild(i).getText().equals("Procedure")*/)
					{

						if(fonc.getNomFonction().equals(a.getChild(0).getChild(i).getChild(0).getText()))// on a trouvé la bonne fonction
						{
							
							/*mise en place du point d'entré de la fo,ction*/
							this.WriteInFile(fonc.getNomFonction()+"_ STW BP, -(SP)", 1);
							this.WriteInFile("      LDW BP, SP", 1);
							this.WriteInFile("      STW r2, -(SP)", 1);
							this.generate(a.getChild(0).getChild(i).getChild(3), calculNextRegion, 1);// pour l'instant on gère que pour une fonction dans la région 1
							//mais il faudra par la suite déterminer dans quelle région on est grace à la fonction utilisé dans l'analyse sémantique
							this.WriteInFile("      ldw sp,bp", 1);
							this.WriteInFile("      LDW BP, (SP)+", 1);
							this.WriteInFile("      RTS", 1);
							this.trouver=true;
						}
						calculNextRegion+=Pro.calculNbr(a.getChild(0).getChild(i))+1;
						System.out.println(calculNextRegion);
					}
				}
			}
		}
		else
		{
            for (int i = 0; i<a.getChildCount();i++)
            {
                     	    if (a.getChild(i).getText().equals("DECLARATION"))
                            {
                     	    	SearchInAst(a.getChild(i), region_a_trouver,region_ast,fonc);
                            }
                            else if (a.getChild(i).getText().equals("FONCTION") || a.getChild(i).getText().equals("PROCEDURE"))
                            {
                            	SearchInAst(a.getChild(i), region_a_trouver,++region_ast,fonc);
                            }
                            else if (a.getChild(i).getText().equals("BLOC"))
                            {
                            	SearchInAst(a.getChild(i), region_a_trouver,region_ast,fonc);
                            }
                     	    System.out.println(region_ast);
            }
		}
	}

	private void operate(Tree child,String s,int mode) 
	{
		// TODO Auto-generated method stub
		if (child.getText().equals("+"))
		{
			operateAdd(child.getChild(0), mode);
			WriteInFile("LDW D1,-(SP)", mode);
			operateAdd(child.getChild(1), mode);
			WriteInFile("LDW R2,(SP)+", mode);
			WriteInFile("ADD R2,D1,D1", mode);
		}
	}
	public static boolean isNumeric(String str)  
	{  
		try  
		{  
			double d = Double.parseDouble(str);  
		}  
		catch(NumberFormatException nfe)  
		{  
			return false;  
		}  
		return true;  
	}
	
	private int operateAdd(Tree child,int mode)
	{
		if(child.getChildCount()==2)
		{
		Tree opg=child.getChild(0);
		Tree opd=child.getChild(1);

		if(isNumeric(opg.getText()))
		{
			operateAdd(opg, mode);
			if(!isNumeric(opd.getText()))// og numeric et opd non numeri
			{
				//il y a un expresion pour opd
				if(opd.getText().equals("+")||opd.getText().equals("-")||opd.getText().equals("*")||opd.getText().equals("/"))
				{
					operate(opd,null, mode);
				}
				else // c'est un idf
				{
					operateAdd(opd, mode);	
				}
			}
			else
			{
				WriteInFile("ADD "+opg.getText()+","+opd.getText()+",D1", mode);
			}
			
		}
		else //opg nn num
		{
			if(isNumeric(opd.getText())) //opg non num et opd num
			{
				//il y a un expresion pour opg
				if(opg.getText().equals("+")||opg.getText().equals("-")||opg.getText().equals("*")||opg.getText().equals("/"))
				{
					operate(opg,null, mode);
				}
				else // c'est un idf
				{
				operateAdd(opg, mode);
				
				}
			}
			else
			{
				operate(opg,null, mode);
				operate(opd,null, mode);
				
			}
			operateAdd(opd, mode);
			WriteInFile("ADD "+opg.getText()+",D1", mode);
		}
		}
		else if (child.getChildCount()==0)
		{
			if(isNumeric(child.getText()))//on tombe sur une feuille numerique
			{
				WriteInFile("LDQ "+child.getText()+",D1", mode);
			}
			else//on tombe sur une feuille associée à id
			{
				//on genere le code qui retrouve la valeur de l'id et on le met dans D1
			}
		}
		return 0;
	}


	private void createFile() 
	{
		try
		{
			java.io.File fichier = new java.io.File("Testons.src");
			if (fichier.exists())
			{
				fichier.delete();
			}
			fichier.createNewFile(); // Cette fonction doit être appelée au sein d'un bloc TRY
			this.nameFile=fichier.getName();
		}
		catch (IOException e)
		{
			System.out.println("Impossible de créer le fichier");
		} 

	}

	public void WriteInFile(String texte,int mode)
	{
		FileWriter writer = null;
		if (mode==0)
		{
		try
		{
			writer = new FileWriter(this.nameFile, true);
			writer.write(texte+"\n",0,texte.length()+1);
			writer.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		}
		else if (mode==1)
		{
			this.codeFunction+=texte+"\n";
		}
	}
}
