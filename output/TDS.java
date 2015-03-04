
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDS {
	String nom;
	ArrayList<Symbole> table = new ArrayList<Symbole>();
	
	public TDS(){
		
	}
	
	public TDS(String nom, ArrayList<Symbole> table) {
		super();
		this.nom = nom;
		this.table = table;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Symbole> getVariable() {
		return table;
	}

	public void setVariable(ArrayList<Symbole> table) {
		this.table = table;
	}
	
	public void getSymboleFct(Tree ast,int prof){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION")){
					getSymboleFct(ast.getChild(i),prof+1);
				}
			}
		}
		else{
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("FONCTION")){
					String nom=ast.getChild(i).getChild(0).getText();
					String type=ast.getChild(i).getChild(1).getText();
					int parametre = ast.getChild(i).getChild(2).getChildCount();
					System.out.print(nom+" "+type+" "+parametre+" "+prof);
					table.add(new Symbole(nom,type,parametre,0,prof));
					System.out.print("\n\n");
					getSymboleFct(ast.getChild(i).getChild(3),prof+1);
				}else{
					getSymboleFct(ast.getChild(i),prof+1);
				}	
			}
		}
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
					l.add(new Symbole(id,type,0,0,prof+1));
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

