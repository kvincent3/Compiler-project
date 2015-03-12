
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDS {
	String nom;
	ArrayList<Symbole> table = new ArrayList<Symbole>();
	int regionRef=0;
	int regionFct;
	ArrayList<TDS> tds = new ArrayList<TDS>();
	
	int reg=0;
	int depl=0;

	public TDS(){
		
	}
	
	public TDS(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void getSymboleFct(Tree ast,int prof, int regionFct,ArrayList<Symbole> table){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION")){
					getSymboleFct(ast.getChild(i),0,0,table);
				}
			}
		}
		else{
			boolean salut=false;
			for(int i=0;i<ast.getChildCount();i++){
				if(prof==0){
					regionFct=0;
					salut=true;
				}
				if(ast.getChild(i).getText().equals("FONCTION")){
					/*if(ast.getText().equals("DECLARATION")){
					}
					else if(regionFct<regionRef){
						regionFct=regionRef+1;
					}*/
					String nom=ast.getChild(i).getChild(0).getText();
					String type=ast.getChild(i).getChild(1).getText();
					int parametre = ast.getChild(i).getChild(2).getChildCount();
					System.out.println("fonction: "+nom+" type: "+type+" parametre: "+parametre+" prof: "+prof+" region : "+regionFct);
					table.add(new Symbole(nom,type,parametre,0,prof,regionFct));
					System.out.println("------------");
<<<<<<< HEAD
					if(regionFct>regionRef){
						regionRef=regionFct+1;
					}
					if(salut){
						regionFct=regionRef;
					}
					getSymboleFct(ast.getChild(i).getChild(3),prof+1,regionFct+1);
=======
					getSymboleFct(ast.getChild(i).getChild(3),prof+1,regionFct+1,table);
>>>>>>> 824ddaeff2ec8f68f5adab771153d2fccee01c69
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){
					String nom=ast.getChild(i).getChild(0).getText();
					System.out.println("procedure: "+nom+" "+" prof: "+prof+" "+" region : "+regionFct);
					table.add(new Symbole(nom,null,0,0,prof,regionFct));
					System.out.println("------------");
<<<<<<< HEAD
					if(regionFct>regionRef){
						regionRef=regionFct+1;
					}
					if(salut){
						regionFct=regionRef;
					}
					getSymboleFct(ast.getChild(i).getChild(2),prof+1,regionFct+1);
				}
				else{
					getSymboleFct(ast.getChild(i),prof+1,regionFct);
				}
=======
					getSymboleFct(ast.getChild(i).getChild(2),prof+1,regionFct+1,table);
				}
				else{
					getSymboleFct(ast.getChild(i),prof+1,regionFct+1,table);
				}	
>>>>>>> 824ddaeff2ec8f68f5adab771153d2fccee01c69
			}
		}
	}
	
	
	
	
	
	public void getSymboleVar(Tree ast,int prof,int region,ArrayList<Symbole> l)//init ast 0 0 l
	{ 
		//static int region=0;
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
					 reg=0;
					return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					System.out.println("fils instruction");
					getSymboleVar(ast.getChild(i),prof,region,l);
					reg=0;
					return;
				}
			}
		}
		
		if(ast.getText().equals("VAR"))
		{
			String type=ast.getChild(0).getText();
			System.out.println("variable(s) trouvÃ©e(s)");
			System.out.print("type: "+type+" ");
			for(int j=1;j<ast.getChildCount();j++)
			{
			 String id=ast.getChild(j).getText();
			System.out.print("id: "+id+" ");
			l.add(new Symbole(id,type,0,region,prof,depl));
			System.out.print(" depl: "+depl+" ");
			depl++;
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
			depl=0;
			getSymboleVar(ast.getChild(i),prof+1,region,l);
			}
			
			return;
		}
		
		for(int i=0,r=region;i<ast.getChildCount();i++)
		{
		  Tree child_i=ast.getChild(i);
		  if(child_i.getText().equals("FONCTION")||child_i.getText().equals("PROCEDURE"))
		  {
			  reg++;
		  getSymboleVar(ast.getChild(i),prof,reg,l);
		  }
		  else
		  {
			  getSymboleVar(ast.getChild(i),prof,region,l);
		  }
		}
		
		
		
		return ;
		}
	
	public void getSymboleArray(Tree ast,int prof,int region,ArrayList<Symbole> l){
		if(ast==null)
		{
			System.out.println("err");
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
					getSymboleArray(ast.getChild(i),prof,region,l);
					 reg=0;
					return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					System.out.println("fils instruction");
					getSymboleArray(ast.getChild(i),prof,region,l);
					reg=0;
					return;
				}
			}
		}	if(ast.getText().equals("ARRAY"))
		{
			String id=ast.getChild(1).getText();
			System.out.println("Tableau trouvé");
			System.out.print("id: "+id+" ");			
			l.add(new Symbole(id,"array",0,region,prof,depl));
			System.out.print(" depl: "+depl+" ");
			depl++;
			
			
	//Bricolage??		
			Tree ast2=ast.getChild(0).getChild(0);
			int k=ast2.getChildCount();
			System.out.println("Tableau de dimension:"+k);
			for (int p=0; p<=k;p++){
			System.out.println("Borne inferiure="+ast2.getChild(p).getChild(0)+"Borne superieure="+ast2.getChild(p).getChild(1));	
			}
			}
			System.out.print("profondeur: "+prof);
			System.out.print(" region: "+region);
			System.out.print("\n\n");
			return;
			
			
		}
	}
	
	
	


