
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	Pro pile;
	private int increment=0;
	private int el_label=0;
	private TDSGlobal tteTds;
    private TDSGlobal tdsFinal;
	//private ArrayList<FonctionRegion> fonctions = new ArrayList<FonctionRegion>();
	boolean trouver;
	String codeFunction="";
	public GenerateCode(Tree ast,Pro pile) {
		ArrayList<Symbole> sym = new ArrayList<Symbole>();
        TDS tds = new TDS();
        tds.getSymboleFct2(ast,0,0,sym);
        tds.getSymboleVar(ast, 0,0, sym);
		 tteTds= tds.merge(sym);
         tdsFinal = tteTds.addNoExistTDS(ast);
		pile = new Pro(tdsFinal);
        pile.doPro(ast,0);
        this.pile=pile;
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
			this.WriteInFile("D1    	  equ r1\n");
			this.WriteInFile("EXIT_EXC   EQU   64 \nREAD_EXC   EQU   65\nWRITE_EXC  EQU   66");
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
						if (ast.getChild(i).getChild(0).getText().equals("integer"))// on donne deux octets pour les entier
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
					if (ast.getChild(i).getText().equals("="))// une affectation
					{
						String idf=ast.getChild(i).getChild(0).getText();//identifiant
						this.operate(ast.getChild(i).getChild(1),null);
						//Integer val=Integer.parseInt(ast.getChild(i).getChild(1).getText());//valeur
						//String cmd=produire_code_stocker_valeur_variable(idf,val,region);
						//this.WriteInFile(cmd);
						
						//int entier = Integer.parseInt(ast.getChild(i).getChild(1).getText());
						//this.WriteInFile("ldw r0, #"+entier);
						///this.WriteInFile("stw r0, (bp)-2");
					}
					else if(ast.getChild(i).getText().equals("WRITE"))
					{
						String idf=ast.getChild(i).getChild(0).getText();
						if(!isNumeric(idf)){
							String res=produire_code_retrouver_valeur_variable(idf,region);
							res+=this.print_asm(6,0);
							this.WriteInFile(res);
						}else{
							this.WriteInFile("adi sp, sp, #-8");
							this.WriteInFile("adi sp, sp, #-2");
							this.WriteInFile("ldw r0, #"+Integer.parseInt(idf));
							this.WriteInFile("stw r0, (bp)-10");
							
							this.WriteInFile("stw r0, (bp)-10");
							this.WriteInFile("ldw r0, #10");
							this.WriteInFile("stw r0, -(sp)");
							this.WriteInFile("adi bp, r0, #-8");
							this.WriteInFile("stw r0, -(sp)");
							this.WriteInFile("ldw r0, (bp)-10");
							this.WriteInFile("stw r0, -(sp)");
							this.WriteInFile("jsr @itoa_");
							this.WriteInFile("adi sp, sp, #6");
							
							this.WriteInFile("adi bp, r0, #-8");
							this.WriteInFile("stw r0, -(sp)");
							this.WriteInFile("jsr @print_");
							this.WriteInFile("adi sp, sp, #2");
						}
					}
					else if (ast.getChild(i).getText().equals("APPEL"))
					{
						function(ast.getChild(i),region);
					}
					else if (ast.getChild(i).getText().equals("for"))
					{
						boucleFor(ast.getChild(i),region);
					}
				}
			}
			if (ast.getText().equals("BLOC"))
			{
				generate(ast.getChild(0),region);//pour les déclarations d'une fonction
				generate(ast.getChild(1),region);//pour les intructions d'une fonction
			}
			if (ast.getText().equals("end"))
			{
				this.WriteInFile("ldw sp, bp \n ldw bp, (sp)+\ntrp #EXIT_EXC\n");
				this.WriteInFile("\n\n\n\n");
				String fichier ="FonctionsAssembleurs";
				//lecture du fichier texte	
				try{
					InputStream ips=new FileInputStream(fichier); 
					InputStreamReader ipsr=new InputStreamReader(ips);
					BufferedReader br=new BufferedReader(ipsr);
					String ligne;
					while ((ligne=br.readLine())!=null){
						this.WriteInFile(ligne);
					}
					br.close(); 
				}		
				catch (Exception e){
					System.out.println(e.toString());
				}
				/*for (int i=0;i<this.fonctions.size();i++)
				{
					this.WriteInFile(fonctions.get(i).getCodeFonction(), 0);
					this.WriteInFile("\n\n\n",0);
					System.out.println(i+"\n");
					System.out.println(fonctions.get(i).getCodeFonction());
				}*/
				// on va aller dans chaque fonction pour générer le code
			   generateAllFunction(this.astree);
			}
		}

	}
	private void boucleFor(Tree ast, int region){
		String nomVariable= ast.getChild(0).getText();
		int valIni = Integer.parseInt(ast.getChild(1).getText())-1;
		int valFin = Integer.parseInt(ast.getChild(2).getText());
		int valDiff = valFin - valIni;
		this.WriteInFile("      STW R10, -(SP)");
		this.WriteInFile("      STW R11, -(SP)");
		this.WriteInFile("      LDQ "+valIni+", R10");
		this.WriteInFile("      LDQ "+valFin+", R11");
		this.WriteInFile("LOOPF ADQ 1, R10");
		String cmd=produire_code_stocker_valeur_variable(nomVariable,valFin,region);// a changer
		this.WriteInFile(cmd);// a changer
		this.operate(ast.getChild(2),null);// a changer
		//this.WriteInFile("      ADQ  1, R0");
		generate(ast.getChild(3),region);
		this.WriteInFile("      CMP R11, R10");
		this.WriteInFile("      JGT #LOOPF-$-2");
		this.WriteInFile("      LDW R11, (SP)");
		this.WriteInFile("      LDW R10, (SP)");
	}
	
	private void generateAllFunction(Tree a) 
	{
		// TODO Auto-generated method stub
        for (int i = 0; i<a.getChildCount();i++)
        {
                 	    if (a.getChild(i).getText().equals("DECLARATION"))
                        {
                 	    	generateAllFunction(a.getChild(i));
                        }
                        else if (a.getChild(i).getText().equals("FONCTION"))
                        {
                        	//generate(a.getChild(i), ++region_ast,0);
							this.WriteInFile(a.getChild(i).getChild(0).getText()+"_ STW BP, -(SP)");
							this.WriteInFile("      LDW BP, SP");
							//this.WriteInFile("      STW r2, -(SP)");
							this.generate(a.getChild(i).getChild(3), ++increment);
                        	System.out.println("fonction"+a.getChild(i).getChild(0).getText()+" c'est la region "+increment);
							this.WriteInFile("      ldw sp,bp");
							this.WriteInFile("      LDW BP, (SP)+");
							this.WriteInFile("      RTS\n\n");
                        	generateAllFunction(a.getChild(i).getChild(3));
                        }
                        else if (a.getChild(i).getText().equals("BLOC"))
                        {
                        	//SearchInAst(a.getChild(i), region_a_trouver,region_ast,fonc);
                        	generateAllFunction(a.getChild(i).getChild(0));
                        }
                 	   
        }
	}

	private void function(Tree ast,int regionAppelant) 
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
			//this.WriteInFile("adq -4, r1");
			// on prend le chainage statique associé pouis on le stock dans r2
			//this.WriteInFile("ldw r2,r1");
			//on fait le jsr
			this.WriteInFile("jsr @"+nomFonction+"_");
			//après l'appel on dépile les paramètres
			this.WriteInFile("adi sp, sp, #"+(ast.getChildCount()-1)*2);
		}
	}


	private void operate(Tree child,String s) 
	{
		// TODO Auto-generated method stub
		if (child.getText().equals("+")||child.getText().equals("-")||child.getText().equals("*"))
		{
				operateAdd(child.getChild(0));//on traite le fils gauche
				WriteInFile("STW D1,-(SP)");// on empile la valeur
				operateAdd(child.getChild(1));// on traite le fils droit
				WriteInFile("STW D1,-(SP)");
				WriteInFile("LDW R2,(SP)+");// on fait l'addition que l'on stock dans D1 / dépiler droite
				WriteInFile("LDW R3,(SP)+");//dépiler gauche
				if (child.getText().equals("+"))
				{
				   WriteInFile("ADD R3,R2,D1");
				}
				else if (child.getText().equals("-"))
				{
					WriteInFile("SUB R3,R2,D1");
				}
				else if (child.getText().equals("*"))
				{
					WriteInFile("MUL R3,R2,D1");
				}
				WriteInFile("STW D1,-(SP)");
			//}
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
		if(child.getText().equals("+") || child.getText().equals("-")||child.getText().equals("*"))//on ne traite que l'addition et soustraction pour le moment 
		{
		Tree opg=child.getChild(0);	
		Tree opd=child.getChild(1);
		if(isNumeric(opg.getText()))
		{
			operateAdd(opg);
			WriteInFile("STW D1,-(SP)");
			if(!isNumeric(opd.getText()))// og numeric et opd non numeri
			{
				//il y a un expresion pour opd
				if(opd.getText().equals("+")||opd.getText().equals("-")||opd.getText().equals("*")||opd.getText().equals("/"))
				{
					operate(opd,null);
					WriteInFile("LDW R2,(SP)+");// on fait l'addition que l'on stock dans D1
					WriteInFile("LDW R3,(SP)+");
					if (child.getText().equals("+"))
					{
					  WriteInFile("ADD R3,R2,D1");
					}
					else if (child.getText().equals("-"))
					{
					  WriteInFile("SUB R3,R2,D1");
					}
					else if (child.getText().equals("*"))
					{
					  WriteInFile("MUL R3,R2,D1");
					}
				}
				else // c'est un idf
				{			
					operateAdd(opd);
				}

			}
			else
			{
				operateAdd(opd);
				WriteInFile("STW D1,-(SP)");
				WriteInFile("LDW R2,(SP)+");// on fait l'addition que l'on stock dans D1
				WriteInFile("LDW R3,(SP)+");
				if (child.getText().equals("+"))
				{
				  WriteInFile("ADD R3,R2,D1");
				}
				else if (child.getText().equals("-"))
				{
				  WriteInFile("SUB R3,R2,D1");
				}
				else if (child.getText().equals("*"))
				{
				  WriteInFile("MUL R3,R2,D1");
				}
				//WriteInFile("STW D1,-(SP)");
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
				operateAdd(opd);
				WriteInFile("STW D1,-(SP)");
				WriteInFile("LDW R2,(SP)+");// on fait l'addition que l'on stock dans D1
				WriteInFile("LDW R3,(SP)+");
				if (child.getText().equals("+"))
				{
				  WriteInFile("ADD R3,R2,D1");
				}
				else if (child.getText().equals("-"))
				{
				  WriteInFile("SUB R3,R2,D1");
				}
				else if (child.getText().equals("*"))
				{
				  WriteInFile("MUL R3,R2,D1");
				}
			}
			else
			{
				operate(opg,null);
				operate(opd,null);
				WriteInFile("LDW R2,(SP)+");
				WriteInFile("LDW R3,(SP)+");
				if (child.getText().equals("+"))
				{
				  WriteInFile("ADD R3,R2,D1");
				}
				else if (child.getText().equals("-"))
				{
				  WriteInFile("SUB R3,R2,D1");
				}
				else if (child.getText().equals("*"))
				{
				  WriteInFile("MUL R3,R2,D1");
				}
			}		
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

	
public String produire_code_affectation_global(String id,int valeur,TDSGlobal tdsSorted)
{
	el_label++;
	TDS root=tdsSorted.getTDSparRegion().get(0);
	ArrayList<Symbole>list=root.getSymboles();
    for(int i=0;i<list.size();i++)
    {
    	if(list.get(i).getNom().equals(id))//si on a un symbole qui a le meme nom que celui recherché
    	{
    		Symbole sym=list.get(i);
    		//on produit le code
    		String res="";
    		int dep=2*sym.getDeplacement();
    		res+="LDW R2, #"+dep+"\n";
    		res+="LDW R3,BP \n";
    		res+="ADD R2,R3,R2 \n";//R2<-BP+depl
    		res+="LDW R3, #"+valeur+"\n";//R3<-valeur
    		res+="STW R3,(R2) \n"; //met à l adresse dans R2 la valeur de R3
    		return res;
    	}
    }
	
	
	return null;
}
public String produire_code_retrouver_valeur_variable(String idf,int region)
{
	el_label++;
	ArrayList<Integer>regions= pile.getPile().get(region);
	TDS tds_reg=tdsFinal.getTDSparRegion().get(region);//TDS de la region regions[i]
	ArrayList<Symbole> symb1=tds_reg.getSymboles();
	int imbriq2=symb1.get(0).getNumeroImbrication();
	for(int i=0;i<regions.size();i++)
	{
		TDS tds_reg_i=tdsFinal.getTDSparRegion().get(regions.get(i));//TDS de la region regions[i]
		ArrayList<Symbole> symb=tds_reg_i.getSymboles();
		for(int j=0;j<symb.size();j++)
		{
		   if(symb.get(j).getNom().equals(idf))
		   {
			   //
			   String res="";
			   Symbole symbol=symb.get(j);
			   int imbriq=symbol.getNumeroImbrication();
			   int nbDepl=imbriq2-imbriq; //nombre de region a sauter pour aller à la region de idf
			   
				   
			   res+="LDW R6,BP\n";//R6<-BP
			   /*if(nbDepl==0)
			     res+="ADQ -4,R6\n";   */
				   
			   res+="LDQ 0, R5\n";
			   res+="LDW R7,#"+nbDepl+"\n";//R7<-nbDepl
			   res+="boucle_search_idf"+el_label+" ";
			   res+="CMP R7,R5\n" ;//compare R7-R5
			   res+="BEQ FIN"+el_label+"-$-2\n";	// verifie si le resultat est equal a zero	   
			   //res+="ADQ -2,R6\n";//R6<-R6-4
			   res+="LDW R6,(R6)\n";//R6<- valeur à l'adresse de R6 (c'est à dire BP)			   
			   res+="ADQ -1,R7\n";//R7<-R7-1 
			   res+="JEA @boucle_search_idf"+el_label+"\n\n";			   
			   res+="FIN"+el_label+" ";
			   //on est dans la region voulue en chainage statique (R6)
			   if(symbol.getDeplacement()>=0)//si c'est une variable
			   {
			   res+="LDW R7,#"+symbol.getDeplacement()*2+"\n";
			   res+="ADQ -2,R6\n";//R6<-R6-4
			   res+="ADD R7,R6,R6\n";//R6<-depl+BP_region_cherchée
			   //res+=this.print_asm(6);
			   res+="LDW R6,(R6)\n";
			   
			   }
			   else // si c'est un parametre
			   {
				   res+="LDW R7,#"+symbol.getDeplacement()*2+"\n";
				   res+="ADQ 8,R6\n";
				   res+="ADD R7,R6,R6\n";//R6<-depl+BP_region_cherchée  //adresse variable cherchée
				   res+="LDW R6,(R6)\n";
			   }
			   
			   res+="ldw r7,#0\n";
			   return res;
		   }
		}
	}
	
	return null;
}


public String produire_code_stocker_valeur_variable(String idf,int valeur,int region)
{
	el_label++;
	ArrayList<Integer>regions= pile.getPile().get(region);
	TDS tds_reg=tdsFinal.getTDSparRegion().get(region);//TDS de la region regions[i]
	ArrayList<Symbole> symb1=tds_reg.getSymboles();
	int imbriq2=symb1.get(0).getNumeroImbrication();
	for(int i=0;i<regions.size();i++)
	{
		TDS tds_reg_i=tdsFinal.getTDSparRegion().get(regions.get(i));//TDS de la region regions[i]
		ArrayList<Symbole> symb=tds_reg_i.getSymboles();
		for(int j=0;j<symb.size();j++)
		{
		   if(symb.get(j).getNom().equals(idf))
		   {
			   //
			   String res="";
			   Symbole symbol=symb.get(j);
			   int imbriq=symbol.getNumeroImbrication();
			   int nbDepl=imbriq2-imbriq; //nombre de region a sauter pour aller à la region de idf
			   
				   
			   res+="LDW R6,BP\n";//R6<-BP
			   /*if(nbDepl==0)
			     res+="ADQ -4,R6\n";   */
				   
			   res+="LDQ 0, R5\n";
			   res+="LDW R7,#"+nbDepl+"\n";//R7<-nbDepl
			   res+="boucle_search_idf"+el_label+" ";
			   res+="CMP R7,R5\n" ;//compare R7-R5
			   res+="BEQ FIN"+el_label+"-$-2\n";	// verifie si le resultat est equal a zero	   
			   //res+="ADQ -2,R6\n";//R6<-R6-4
			   res+="LDW R6,(R6)\n";//R6<- valeur à l'adresse de R6 (c'est à dire BP)			   
			   res+="ADQ -1,R7\n";//R7<-R7-1 
			   res+="JEA @boucle_search_idf"+el_label+"\n\n";			   
			   res+="FIN"+el_label+" ";
			   //on est dans la region voulue en chainage statique (R6)
			   if(symbol.getDeplacement()>=0)//si c'est une variable
			   {
			   res+="LDW R7,#"+symbol.getDeplacement()*2+"\n";
			   res+="ADQ -2,R6\n";//R6<-R6-4
			   res+="ADD R7,R6,R6\n";//R6<-depl+BP_region_cherchée
			   //res+=print_asm(6);
			   res+="LDW R8,#"+valeur+"\n";
			   res+="STW R8,(R6)\n";
			   //res+=print_asm(6,1);
			   }
			   else // si c'est un parametre
			   {
				   res+="LDW R7,#"+symbol.getDeplacement()*2+"\n";
				   res+="ADQ 8,R6\n";
				   res+="ADD R7,R6,R6\n";//R6<-depl+BP_region_cherchée  //adresse variable cherchée
				   res+="LDW R8,#"+valeur+"\n";
				   res+="STW R8,(R6)\n";
			   }
			   
			   res+="ldw r7,#0\n";
			   return res;
		   }
		}
	}
	
	return null;
}

private String print_asm(int num_registre,int mode)// 0 mode direct 1 mode indirect
{
	String res="\n";
	
	
	
    res+="stw bp, -(sp)\n";
    res+="ldw bp, sp\n";

//char toto[7];
// réserve 7+1 = 8 caractères en pile
// (entier pair supérieur à 7 demandé pour pas désaligner pile)
    res+="adi sp, sp, #-8 \n";  // réserve place pour text sur pile (8 octets); 
                      // déplacement du début du tableau est -8

//int value;
    res+="adi sp, sp, #-2\n";  // réserve place pour variable value;
                      // déplacement de value est -10

//value = -23; 
    if(mode==1)
    {
    res+="ldw r0,(R"+num_registre+")\n";      // charge r0 avec -23 = C2(23) = FFE9
    }
    else
    {
    	res+="ldw r0,R"+num_registre+"\n";
    }
    	
    res+="stw r0, (bp)-10\n" ;  // sauve r0 à l'adresse bp-10       

//itoa(value, text, 10); // appelle itoa avec i = value, p = text, b = 10

	res+="ldw r0, #10 \n ";   // charge 10 (pour base décimale) dans r0
    res+="stw r0, -(sp)\n" ;   // empile contenu de r0 (paramètre b)

    res+= "adi bp, r0, #-8\n";   // r0 = bp - 8 = adresse du tableau text
    res+="stw r0, -(sp)\n";    // empile contenu de r0 (paramètre p)

    res+="ldw r0, (bp)-10\n ";  // charge r0 avec value
    res+="stw r0, -(sp) \n" ;   // empile contenu de r0 (paramètre i)

    res+="jsr @itoa_ \n" ;      // appelle fonction itoa d'adresse itoa_

    res+="adi sp, sp, #6 \n" ;  // nettoie la pile des paramètres 
                      // de taille totale 6 octets

//print(text);

    res+="adi bp, r0, #-8  \n";// r0 = bp - 8 = adresse du tableau text
    res+="stw r0, -(sp)\n";     // empile contenu de r0 (paramètre p)
    
    res+="jsr @print_ \n";      // appelle fonction print d'adresse print_

    res+="adi sp, sp, #2\n  " ; // nettoie la pile des paramètres
                      // de taille totale 2 octets

//}  // fermeture du bloc englobant de main
    res+="ldw sp, bp \n";       // abandonne variables locales de main
    res+="ldw bp, (sp)+\n";     // dépile ancien bp dans bp
    //res+="trp #EXIT_EXC\n\n" ;    // lance trappe EXIT
	
	return res;
}




}




