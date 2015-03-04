
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDS {
	String nom;
	ArrayList<Symbole> variable = new ArrayList<Symbole>();
	
	public TDS(){
		
	}
	
	public TDS(String nom, ArrayList<Symbole> variable) {
		super();
		this.nom = nom;
		this.variable = variable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Symbole> getVariable() {
		return variable;
	}

	public void setVariable(ArrayList<Symbole> variable) {
		this.variable = variable;
	}
	public void getSymboleVar(Tree ast,int prof,ArrayList<Symbole> l)
	{
		if(ast==null)
		{
			return ;
		}
		if(ast.getChildCount()==0)
		{
			System.out.println("feuille");
			return;
		}
		if(ast.getText().equals("do"))
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
				
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					System.out.println("fils declaration");
					getSymboleVar(ast.getChild(i),1,l);
					
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					System.out.println("fils instruction");
					getSymboleVar(ast.getChild(i),1,l);
				}
			}
		}
		
		if(ast.getText().equals("DECLARATION"))
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
				Tree child_i=ast.getChild(i);
				if(child_i.getText().equals("VAR"))
				{
					String type=child_i.getChild(0).getText();
					System.out.println("variable(s) trouvée(s)");
					System.out.print("type: "+type+" ");
					for(int j=1;j<child_i.getChildCount();j++)
					{
					 String id=child_i.getChild(j).getText();
					System.out.print("id: "+id+" ");
					l.add(new Symbole(id,type,null,null,Integer.toString(prof+1)));
					}
					System.out.print("\n\n");
				}
				else
				{
					getSymboleVar(ast.getChild(i),prof,l);
				}
				
			}
		}
		else if(ast.getText().equals("INSTRUCTION"))
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
				
				getSymboleVar(ast.getChild(i),prof,l);
			}
		}
		
		
		;
		return ;
		
		
	}

	
}

