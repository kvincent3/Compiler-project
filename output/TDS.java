
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDS {
	String nom;
	ArrayList<Symbole> table = new ArrayList<Symbole>();
	int regionRef=0;
	int regiontds;
	int regionFct;
	ArrayList<Symbole> symboles = new ArrayList<Symbole>();
	ArrayList<TDS> tds = new ArrayList<TDS>();
	
	int reg=0;
	int depl=0;

	public TDS(){
		
	}
	
	public TDS(int regiontds) 
	{
		this.regiontds = regiontds;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
       
	public ArrayList<Symbole> getSymboles()
	{
		return this.symboles;
	}

	public int getregion()
	{
		return regiontds;
	}

	public void getSymboleFct2(Tree ast,int prof, int regionFct2,ArrayList<Symbole> table){
		if(ast==null){
			return;
		}
		if(ast.getText().equals("do")){
			for(int i=0;i<ast.getChildCount();i++){
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					getSymboleFct2(ast.getChild(i),0,0,table);
				}
			}
		}
		else{
			for(int i=0;i<ast.getChildCount();i++){
				
				if(ast.getChild(i).getText().equals("FONCTION")){
					
					String nom=ast.getChild(i).getChild(0).getText();
					String type=ast.getChild(i).getChild(1).getText();
					int parametre = ast.getChild(i).getChild(2).getChildCount();
					for(int j=0;j<ast.getChild(i).getChild(2).getChildCount();j++){
						if(!ast.getChild(i).getChild(2).getChild(j).getChild(0).getText().equals("adr")){
							String nomParam=ast.getChild(i).getChild(2).getChild(j).getChild(0).getText();
							String typeParam=ast.getChild(i).getChild(2).getChild(j).getChild(1).getText();
							int regionFct2Param=regionFct+1;
							int profParam=prof+1;
							table.add(new Symbole(nomParam,"parametreV",typeParam,-1,regionFct2Param,profParam,0,null));
						}else{
							String nomParam=ast.getChild(i).getChild(2).getChild(j).getChild(1).getText();
							String typeParam=ast.getChild(i).getChild(2).getChild(j).getChild(2).getText();
							int regionFct2Param=regionFct+1;
							int profParam=prof+1;
							table.add(new Symbole(nomParam,"parametreA",typeParam,-1,regionFct2Param,profParam,0,null));
						}
					}
					table.add(new Symbole(nom,"fonction",type,parametre,regionFct2,prof,-1,null));
					getSymboleFct2(ast.getChild(i).getChild(3).getChild(0),prof+1,++regionFct,table);
					
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){
					String nom=ast.getChild(i).getChild(0).getText();
					int parametreProc = ast.getChild(i).getChild(1).getChildCount();
					for(int j=0;j<ast.getChild(i).getChild(1).getChildCount();j++){
						if(!ast.getChild(i).getChild(1).getChild(j).getChild(0).getText().equals("adr")){
							String nomParam=ast.getChild(i).getChild(1).getChild(j).getChild(0).getText();
							String typeParam=ast.getChild(i).getChild(1).getChild(j).getChild(1).getText();
							int regionFct2Param=regionFct+1;
							int profParam=prof+1;
							table.add(new Symbole(nomParam,"parametreV",typeParam,-1,regionFct2Param,profParam,0,null));
						}else{
							String nomParam=ast.getChild(i).getChild(1).getChild(j).getChild(1).getText();
							String typeParam=ast.getChild(i).getChild(1).getChild(j).getChild(2).getText();
							int regionFct2Param=regionFct+1;
							int profParam=prof+1;
							table.add(new Symbole(nomParam,"parametreA",typeParam,-1,regionFct2Param,profParam,0,null));
						}

					}
					table.add(new Symbole(nom,"procedure",null,parametreProc,regionFct2,prof,-1,null));					
					getSymboleFct2(ast.getChild(i).getChild(2).getChild(0),prof+1,++regionFct,table);
					
					//regionFct++;
				}
				else{
					getSymboleFct2(ast.getChild(i),prof+1,regionFct2,table);
					//regionFct++;
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
			return;
		}
		if(ast.getText().equals("do"))
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
				
				if(ast.getChild(i).getText().equals("DECLARATION"))
				{
					 getSymboleVar(ast.getChild(i),prof,region,l);
					 reg=0;
					 return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					getSymboleVar(ast.getChild(i),prof,region,l);
					reg=0;
					return;
				}
			}
		}
		
		if(ast.getText().equals("VAR") && !ast.getChild(0).getText().equals("ARRAY"))
		{  
			String type=ast.getChild(0).getText();
			for(int j=1;j<ast.getChildCount();j++)
			{
			 String id=ast.getChild(j).getText();
			 l.add(new Symbole(id,"variable",type,-1,region,prof,depl,null));
			 depl++;
			}
			return;
			
		}
		else if (ast.getText().equals("VAR") && ast.getChild(0).getText().equals("ARRAY"))
		{
			String type=ast.getChild(0).getText();
			int dimen=ast.getChild(0).getChild(0).getChildCount();
			Tree interval = ast.getChild(0).getChild(0);
			Tableau tab = new Tableau();
			tab.setDimension(dimen);
			
			for (int i=0;i<dimen;i++)
			{
				Tree Case = interval.getChild(i);
				String a = Case.getChild(0).getText();
				String b = Case.getChild(1).getText();
				int a1 = Integer.parseInt(a);
				int b1 = Integer.parseInt(b);
				int[] bounds = {a1,b1};
				tab.getBounds().add(bounds);
			}
			for(int j=1;j<ast.getChildCount();j++)
			{
			    String id=ast.getChild(j).getText();
			    l.add(new Symbole(id,"variable",type,-1,region,prof,depl,tab));
			    depl++;
			}
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
	

           	public void merge(ArrayList<Symbole> sym) 
		{
			TDSGlobal tdsFinal = new TDSGlobal();
			for (int i=0;i<sym.size();i++)
			{
				Symbole Symbolecourant = sym.get(i);
			    boolean ispresent=false;
				for (int j=0;j<tdsFinal.getTDSparRegion().size();j++)
				{
					TDS TDScourante = tdsFinal.getTDSparRegion().get(j);
					if (TDScourante.getregion() == Symbolecourant.getNumeroRegion())
					{
					    ispresent =true;
					    TDScourante.getSymboles().add(Symbolecourant);
					}
				}
				if (!ispresent)
				{
					TDS nouvelle = new TDS (Symbolecourant.getNumeroRegion());

					nouvelle.getSymboles().add(Symbolecourant);
					tdsFinal.getTDSparRegion().add(nouvelle);
				}
			}
			System.out.println("\n\n");
			tdsFinal.sort();
			tdsFinal.display();
	       }

	}
	
	
	



