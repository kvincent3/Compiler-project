import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;


public class GenerateCode 
{
	Tree ast;
	String nameFile;
	public GenerateCode(Tree a) {
		this.ast=a;
		this.createFile();
		this.generate(this.ast,0);
	}
	
	private void generate(Tree ast ,int region) 
	{
		if (ast.getText().equals("do"))
		{
			this.WriteInFile("sp          equ r15\nwr          equ r14\nbp          equ r13");
			this.WriteInFile("SP          equ r15\nWR          equ r14\nBP          equ r13");
			this.WriteInFile("EXIT_EXC   EQU   64 \n READ_EXC   EQU   65\n WRITE_EXC  EQU   66" );
			this.WriteInFile("NUL         equ  0\nNULL        equ  0 \nNIL         equ  0  ");
			this.WriteInFile("STACK_ADRS  equ 0x1000 \nLOAD_ADRS   equ 0xFE00  \norg LOAD_ADRS\nstart do");
			this.WriteInFile("do ldw SP, #STACK_ADRS");
			this.WriteInFile("ldq NIL, BP");
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
						if (ast.getChild(i).getChild(0).getText().equals("integer"))
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
						int entier = Integer.parseInt(ast.getChild(i).getChild(1).getText());
						this.WriteInFile("ldw r0, #"+entier);
						this.WriteInFile("stw r0, (bp)-2");
					}
					if(ast.getChild(i).getText().equals("WRITE"))
					{
						this.WriteInFile("adi bp, r0, #-2");
						this.WriteInFile("stw r0, -(sp)");
						this.WriteInFile("jsr @print_");
						this.addPrint_();
					}
				}
			}
			if (ast.getText().equals("end"))
			{
				this.WriteInFile("ldw sp, bp \n ldw bp, (sp)+\ntrp #EXIT_EXC \n jea @do");
			}
		}

	}
	private void addPrint_() {
		this.WriteInFile("print_     LDQ 0, R1\n STW BP, -(SP)\nLDW BP, SP\n SUB SP, R1, SP\n LDW R0, (BP)4\nTRP #WRITE_EXC\nLDW SP, BP\nLDW BP, (SP)+\nRTS");
		
	}

	private void createFile() 
	{
		try
		{
			java.io.File fichier = new java.io.File("fichier.src");
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
