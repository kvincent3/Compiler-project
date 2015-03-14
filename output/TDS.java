
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
				if(ast.getChild(i).getText().equals("DECLARATION")){
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
						String nomParam=ast.getChild(i).getChild(2).getChild(j).getChild(0).getText();
						String typeParam=ast.getChild(i).getChild(2).getChild(j).getChild(1).getText();
						int regionFct2Param=regionFct+1;
						int profParam=prof+1;
						System.out.println("parametre: "+nomParam+" type: "+typeParam+" prof: "+profParam+" region : "+regionFct2Param);
						table.add(new Symbole(nomParam,"param",typeParam,0,regionFct2Param,profParam,0,null));
					}
					System.out.println("fonction: "+nom+" type: "+type+" parametre: "+parametre+" prof: "+prof+" region : "+regionFct2);
					table.add(new Symbole(nom,"fonction",type,parametre,regionFct2,prof,-1,null));
					System.out.println("------------");
					getSymboleFct2(ast.getChild(i).getChild(3),prof+1,++regionFct,table);
					
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){
					String nom=ast.getChild(i).getChild(0).getText();
					System.out.println("procedure: "+nom+" "+" prof: "+prof+" "+" region : "+regionFct2);
					table.add(new Symbole(nom,"procedure",null,0,regionFct2,prof,-1,null));
					System.out.println("------------");
					
					getSymboleFct2(ast.getChild(i).getChild(2),prof+1,++regionFct,table);
					
					//regionFct++;
				}
				else{
					getSymboleFct2(ast.getChild(i),prof+1,regionFct2,table);
					//regionFct++;
				}	
			}
		}
	}
	
	void getSymboleFct(Tree ast,int prof, int regionFct,ArrayList<Symbole> table){
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
					table.add(new Symbole(nom,"fonction",type,parametre,0,prof,regionFct,null));
					System.out.println("------------");

					if(regionFct>regionRef){
						regionRef=regionFct+1;
					}
					if(salut){
						regionFct=regionRef;
					}
					
					getSymboleFct(ast.getChild(i).getChild(3),prof+1,regionFct+1,table);
				}
				else if(ast.getChild(i).getText().equals("PROCEDURE")){
					String nom=ast.getChild(i).getChild(0).getText();
					System.out.println("procedure: "+nom+" "+" prof: "+prof+" "+" region : "+regionFct);
					table.add(new Symbole(nom,"procedure",null,0,0,prof,regionFct,null));
					System.out.println("------------");

					if(regionFct>regionRef){
						regionRef=regionFct+1;
					}
					if(salut){
						regionFct=regionRef;
					}
					getSymboleFct(ast.getChild(i).getChild(2),prof+1,regionFct+1,table);
				
				}
				else{
					getSymboleFct(ast.getChild(i),prof+1,regionFct+1,table);
				}	

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
		
		if(ast.getText().equals("VAR") && !ast.getChild(0).getText().equals("ARRAY"))
		{
			String type=ast.getChild(0).getText();
			System.out.println("variable(s) trouvée(s)");
			System.out.print("type: "+type+" ");
			for(int j=1;j<ast.getChildCount();j++)
			{
			 String id=ast.getChild(j).getText();
			System.out.print("id: "+id+" ");
			l.add(new Symbole(id,"variable",type,-1,region,prof,depl,null));
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
				
					
				if(ast.getChild(i).getChild(0).getChild(0).getText().equals("ARRAY"))	
				{  
					Tree ast1=ast.getChild(i).getChild(0).getChild(0);
				    String id=ast.getChild(i).getChild(0).getChild(1).getText();
					System.out.println("Tableau trouvé");
					System.out.print("id: "+id+" ");			
										System.out.print(" depl: "+depl+" ");
					depl++;
					Tree ast2=ast1.getChild(0);
					int k=ast2.getChildCount();
					System.out.println("Tableau de dimension:"+k);
					System.out.println("profondeur: "+prof);
					System.out.println("region: "+region);
					for (int p=0; p<k;p++){
						int o=p+1;
						Tree ast3=ast2.getChild(p);
					System.out.println("Interval "+o+" Borne inferiure="+ast3.getChild(0).getText()+ " " +"Borne superieure="+ast3.getChild(1).getText());	
				
				Symbole T=new Symbole(id,"Array","arrayS",0,region,prof,depl,null);
				
					l.add(T);
					}
					return;
					}
				}
					
				
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					System.out.println("fils instruction");
					getSymboleArray(ast.getChild(i),prof,region,l);
					reg=0;
				
					if(ast.getChild(i).getChild(0).getChild(0).getText().equals("ARRAY"))	
					{  
						Tree ast1=ast.getChild(i).getChild(0).getChild(0);
					    String id=ast.getChild(i).getChild(0).getChild(1).getText();
						System.out.println("Tableau trouvé");
						System.out.print("id: "+id+" ");			
											System.out.print(" depl: "+depl+" ");
						depl++;
						Tree ast2=ast1.getChild(0);
						int k=ast2.getChildCount();
						System.out.println("Tableau de dimension:"+k);
						System.out.println("profondeur: "+prof);
						System.out.println("region: "+region);
						for (int p=0; p<k;p++){
							int o=p+1;
							Tree ast3=ast2.getChild(p);
						System.out.println("Interval "+o+" Borne inferiure="+ast3.getChild(0).getText()+ " " +"Borne superieure="+ast3.getChild(1).getText());	
					    Symbole T=new Symbole(id,"Array","arrayS",0,region,prof,depl,null);
					
						l.add(T);
						}
						return;
						}
					}
	
		}
		}
	}
	
	
	
	
	
	
	
	

           	public void merge(ArrayList<Symbole> sym) 
		{
			TDSGlobal tdsFinal = new TDSGlobal();
			for (int i=0;i<sym.size();i++)
			{
				Symbole Symbolecourant = sym.get(i);
				System.out.println(Symbolecourant.getNom()+"   "+Symbolecourant.getNumeroRegion());
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
			tdsFinal.display();
	       }

	}
	
	
	



