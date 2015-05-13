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
	
	public GenerateCode(Tree ast) {
		this.astree=ast;
		this.createFile();
		this.generate(this.astree,0);
	}

	private void generate(Tree ast ,int region) 
	{
		if (ast.getText().equals("do"))
		{
			this.WriteInFile("sp          equ r15\nwr          equ r14\nbp          equ r13");
			this.WriteInFile("SP          equ r15\nWR          equ r14\nBP          equ r13");
			this.WriteInFile("D1		  equ r1\n");
			this.WriteInFile("EXIT_EXC   EQU   64 \nREAD_EXC   EQU   65\nWRITE_EXC  EQU   66" );
			this.WriteInFile("\n");
			this.WriteInFile("NUL         equ  0\nNULL        equ  0 \nNIL         equ  0  ");
			this.WriteInFile("\n");
			this.WriteInFile("STACK_ADRS  equ 0x1000 \nLOAD_ADRS   equ 0xFE00  \norg LOAD_ADRS\nstart do\n");
			this.WriteInFile("do ldw SP, #STACK_ADRS");
			this.WriteInFile("ldw bp, #NIL");
			this.WriteInFile("stw BP, -(SP)");
			this.WriteInFile("ldw BP, SP");
			
			generate(ast.getChild(0),0);
			generate(ast.getChild(1),0);
			generate(ast.getChild(2), 0);
		}
		else
		{

			if (ast.getText().equals("DECLARATION"))
			{
				for (int i=0;i<ast.getChildCount();i++)
				{
					if (ast.getChild(i).getText().equals("VAR"))
					{
						if (ast.getChild(i).getChild(0).getText().equals("integer"))// on donne deux octest pour les entier
						{
							this.WriteInFile("adi sp, sp, #-2");					
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
						this.operate(ast.getChild(i).getChild(1),null);
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
						
						function(ast.getChild(i));
					}
				}
			}
			if (ast.getText().equals("end"))
			{
				this.WriteInFile("ldw sp, bp \n ldw bp, (sp)+\ntrp #EXIT_EXC\n");
				this.WriteInFile("\n\n");
				this.WriteInFile("fMax_ STW BP, -(SP)");
				this.WriteInFile("      LDW BP, SP");
				this.WriteInFile("      STW r2, -(SP)");
				this.WriteInFile("      ldq 1,r7");
				this.WriteInFile("      ldw sp,bp");
				this.WriteInFile("      LDW BP, (SP)+");
				this.WriteInFile("      RTS");
			}
		}

	}

	private void function(Tree ast) 
	{
		//pour l'instant on ne gère que les entiers
		String nomFonction= ast.getChild(0).getText();
		
		// on empile les paramètres
		if (ast.getChildCount()>1)// si la fonction à des paramètres
		{	//on met chaque paramètre dans r0 puis on empile
			for (int i=1;i<ast.getChildCount();i++)
			{
				
				if (isNumeric(ast.getChild(i).getText()))//si le paramètre est un entier
				{
					
					this.WriteInFile("ldw r0, #"+ast.getChild(i).getText());//on met dans r0
					this.WriteInFile("stw r0, -(sp)");//on empile
				}
			}
			//maintenant on calcul le chainage statique que l'on range dans r2
			//on charge Bp dans r1
			this.WriteInFile("ldw r1,bp");
			//on soustrait 4 à r1 pour retrouver notre chainage statique
			this.WriteInFile("adq -4, r1");
			// on prend le chainage statique associé pouis on le stock dans r2
			this.WriteInFile("ldw r2,(r1)");
			//on fait le jsr
			this.WriteInFile("jsr @"+nomFonction+"_");
			//après l'appel on dépile les paramètres
			this.WriteInFile("adi sp, sp, #"+(ast.getChildCount()-1)*2);
			System.out.println("ouiiiiiiiii");
		}
	}

	private void operate(Tree child,String s) 
	{
		// TODO Auto-generated method stub
		if (child.getText().equals("+"))
		{
			operateAdd(child.getChild(0));
			WriteInFile("LDW D1,-(SP)");
			operateAdd(child.getChild(1));
			WriteInFile("LDW R2,(SP)+");
			WriteInFile("ADD R2,D1,D1");
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
	private int operateAdd(Tree child)
	{
		if(child.getChildCount()==2)
		{
		Tree opg=child.getChild(0);
		Tree opd=child.getChild(1);

		if(isNumeric(opg.getText()))
		{
			operateAdd(opg);
			if(!isNumeric(opd.getText()))// og numeric et opd non numeri
			{
				//il y a un expresion pour opd
				if(opd.getText().equals("+")||opd.getText().equals("-")||opd.getText().equals("*")||opd.getText().equals("/"))
				{
					operate(opd,null);
				}
				else // c'est un idf
				{
					operateAdd(opd);		
				}
			}
			else
			{
				WriteInFile("ADD "+opg.getText()+","+opd.getText()+",D1");
			}
			
		}
		else //opg nn num
		{
			if(isNumeric(opd.getText())) //opg non num et opd num
			{
				//il y a un expresion pour opg
				if(opg.getText().equals("+")||opg.getText().equals("-")||opg.getText().equals("*")||opg.getText().equals("/"))
				{
					operate(opg,null);
				}
				else // c'est un idf
				{
				operateAdd(opg);
				
				}
			}
			else
			{
				operate(opg,null);
				operate(opd,null);
				
			}
			operateAdd(opd);
			WriteInFile("ADD "+opg.getText()+",D1");
		}
		}
		else if (child.getChildCount()==0)
		{
			if(isNumeric(child.getText()))//on tombe sur une feuille numerique
			{
				WriteInFile("LDQ "+child.getText()+",D1");
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

	public void WriteInFile(String texte)
	{
		FileWriter writer = null;
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
}
