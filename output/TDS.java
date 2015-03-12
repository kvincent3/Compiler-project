
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDS {
	String nom;
	ArrayList<Symbole> table = new ArrayList<Symbole>();
	int regionFct;
	ArrayList<TDS> tds = new ArrayList<TDS>();
	
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
	
	public void getSymboleFct(Tree ast,int prof, int regionFct){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION")){
					getSymboleFct(ast.getChild(i),0,0);
				}
			}
		}
		else{
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("FONCTION")){
					String nom=ast.getChild(i).getChild(0).getText();
					String type=ast.getChild(i).getChild(1).getText();
					int parametre = ast.getChild(i).getChild(2).getChildCount();
					System.out.println("fonction: "+nom+" type: "+type+" parametre: "+parametre+" prof: "+prof+" region : "+regionFct);
					table.add(new Symbole(nom,type,parametre,0,prof,regionFct));
					System.out.println("------------");
					getSymboleFct(ast.getChild(i).getChild(3),prof+1,regionFct+1);
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){
					String nom=ast.getChild(i).getChild(0).getText();
					System.out.println("procedure: "+nom+" "+" prof: "+prof+" "+" region : "+regionFct);
					table.add(new Symbole(nom,null,0,0,prof,regionFct));
					System.out.println("------------");
					getSymboleFct(ast.getChild(i).getChild(2),prof+1,regionFct+1);
				}
				else{
					getSymboleFct(ast.getChild(i),prof+1,regionFct+1);
				}	
			}
		}
	}
	
	public void getSymboleVar(Tree ast,int prof,int region,ArrayList<Symbole> l)//init ast 0 0 l
	{ 
		if(ast==null)
		{
			System.out.println("arr");
			return ;
		}
		if(ast.getChildCount()==0)
		{
			//System.out.println("feuille");
			return;
		}
		//System.out.print("etiquette : "+ast.getText()+" prof= "+prof+" \n");
		if(ast.getText().equals("do"))
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
				
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					System.out.println("fils declaration");
					getSymboleVar(ast.getChild(i),prof,region,l);
					return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					System.out.println("fils instruction");
					getSymboleVar(ast.getChild(i),prof,region,l);
					return;
				}
			}
		}
		
		if(ast.getText().equals("VAR"))
		{
			String type=ast.getChild(0).getText();
			System.out.println("variable(s) trouvée(s)");
			System.out.print("type: "+type+" ");
			for(int j=1;j<ast.getChildCount();j++)
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
					l.add(new Symbole(id,type,0,0,prof+1,0));
					}
					System.out.print("\n\n");
				}
				else
				{
					getSymboleVar(ast.getChild(i),prof,l);
				}
				
			 String id=ast.getChild(j).getText();
			System.out.print("id: "+id+" ");
			l.add(new Symbole(id,type,null,Integer.toString(region),Integer.toString(prof)));
			}
			System.out.print("profondeur: "+prof);
			System.out.print(" region: "+region);
			System.out.print("\n\n");
			return;
			
		}
		else if(ast.getText().equals("FONCTION")||ast.getText().equals("PROCEDURE") )
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
			getSymboleVar(ast.getChild(i),prof+1,region,l);
			}
			return;
		}
		
		for(int i=0,r=region;i<ast.getChildCount();i++)
		{
		  Tree child_i=ast.getChild(i);
		  if(child_i.getText().equals("FONCTION")||child_i.getText().equals("PROCEDURE"))
		  {
			  r=r+1;
		  getSymboleVar(ast.getChild(i),prof,r,l);
		  }
		  else
		  {
			  getSymboleVar(ast.getChild(i),prof,region,l);
		  }
		}
		
		
		
		return ;
		
		
	}

	
}

