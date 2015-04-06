
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class SemanticsTab {

	int reg=0;
	private ArrayList<String> tokens;
	private ArrayList<String> tokens1;
 	public SemanticsTab()
	{
 		
 		tokens=new ArrayList<String>();
 		tokens1=new ArrayList<String>();
 		tokens.add("+");
 		tokens.add("-");
 		tokens.add("*");
 		tokens.add("+");
 		tokens1.add("==");
 		tokens1.add("!=");
 		tokens1.add("<==");
 		tokens1.add("=>");
 		tokens1.add(">");
 		tokens1.add("<");
		
	}
	//ctrls 1
 	//FONCTIO A UTILISER ----> PrintArraySemanticError
	private void printSemanticsErrorDecl(TDSGlobal tdsSorted)
	{
		if(tdsSorted==null)
			{
			System.err.print("erreur la tds est nulle\n");
			return;
			}
		ArrayList<TDS> TDSparRegion=tdsSorted.getTDSparRegion();
		for(int i=0;i<TDSparRegion.size();i++)
		{
			//System.out.println(" i= "+i);
			TDS tds_i=TDSparRegion.get(i);
			ArrayList<Symbole> symb_list_i=tds_i.getSymboles();
			ArrayList<String> names=new ArrayList<String>();
			for(int j=0;j<symb_list_i.size()-1;j++)
			{
				Symbole sym=symb_list_i.get(j);
				
					//System.out.print("yolo j="+j+" hmm"+sym.getType()+"\n");
				if(sym.getType()!=null &&sym.getType().equals("ARRAY"))
				{
					for(int k=0;k<symb_list_i.size();k++)
					{
						if(k!=j)
						{
						Symbole sym_k=symb_list_i.get(k);
						if(sym_k.getNom().equals(sym.getNom()))
						{
							if(!names.contains(sym_k.getNom()))
							{
								
								names.add(sym_k.getNom());
							}
						}
						}
					}
				}
				
			}
			printName(names);
		}
		
	}
	private void printName(ArrayList<String> names)
	{
		if(names.size()==0)
			return;
		for(int i=0;i<names.size();i++)
		{
			System.err.print("l'array : "+ names.get(i)+" a été declaré plusieurs fois\n");
		}
			
	}
	//ctrls 2
	/*
	public void printSemanticsBound(TDSGlobal tdsSorted)
	{
		if(tdsSorted==null)
		{
		System.out.print("erreur la tds est nulle\n");
		return;
		}
	ArrayList<TDS> TDSparRegion=tdsSorted.getTDSparRegion();
	for(int i=0;i<TDSparRegion.size();i++)
	{
		//System.out.println(" i= "+i);
		TDS tds_i=TDSparRegion.get(i);
		ArrayList<Symbole> symb_list_i=tds_i.getSymboles();
		
		for(int j=0;j<symb_list_i.size()-1;j++)
		{
			Symbole sym=symb_list_i.get(j);
			
				//System.out.print("yolo j="+j+" hmm"+sym.getType()+"\n");
			if(sym.getType()!=null &&sym.getType().equals("ARRAY"))
			{
				ArrayList<int[]> bounds=sym.getInfoTableau().getBounds();
				for(int k=0;k<bounds.size();k++)
				{
					int bound_k[]=bounds.get(k);
					if(bound_k[0]>bound_k[1])
					{
					  System.out.println("les frontieres de l'array "+sym.getNom()+" ne sont pas correctes");
					  System.out.println("--->"+bound_k[0]+" > "+bound_k[1]);
					}
				}
			}
			
		}
		//printName(names);
	}
		
	}

*/	
	public void checkBounds(Symbole s)
	{
		if(s.getType()!=null &&s.getType().equals("ARRAY"))
		{
			ArrayList<int[]> bounds=s.getInfoTableau().getBounds();
			for(int k=0;k<bounds.size();k++)
			{
				int bound_k[]=bounds.get(k);
				if(bound_k[0]>bound_k[1])
				{
				  System.err.println("les frontieres de l'array "+s.getNom()+" ne sont pas correctes");
				  System.err.println("--->"+bound_k[0]+" > "+bound_k[1]);
				}
			
			}
		}
		
	}
	

	private void getSymbole(Tree ast,ArrayList<String> l)
	{
		if(ast==null)
		{
			System.out.println("arr");
			return ;
		}
		if(ast.getText().equals("APPEL"))
		{
			l.add(ast.getChild(0).getText());
		}
		if(ast.getText().equals("CASE")||ast.getText().equals("VAL"))
		{
			for(int h=0;h<ast.getChildCount();h++)
    		{
				getSymbole(ast.getChild(h),l);
    		}
		}
		if(ast.getChildCount()==0)
		{
			if(ast.getText().equals("true")||ast.getText().equals("false"))
				{
				l.add("erreur bool");
				return ;
				}
			else if(!l.contains(ast.getText()))
			   {   
				//System.out.println(ast.getText());
				l.add(ast.getText());
			     return;
			   }
		}
		
		if(tokens.contains(ast.getText()))
		{
			l.add(ast.getChild(0).getText());
			getSymbole(ast.getChild(1),l);
		}
		else if(tokens1.contains(ast.getText()))
		{
			l.add("erreur bool2");
			l.add(ast.getChild(0).getText());
			getSymbole(ast.getChild(1),l);
		}
		
	}

	private void checkExprBr(Tree ast,TDSGlobal tdsSorted,ArrayList<String> l,int region,String name)
	{
		if(l.contains("erreur bool"))
		{
			System.err.println("vous ne pouvez pas mettre comme indice du tableau "+name+" un booleen ");
			return;
		}
		if(l.contains("erreur bool2"))
		{
			System.err.println("vous ne pouvez pas mettre comme indice du tableau "+name+" un booleen (expression booleene) ");
			return;
		}
		Pro pile = new Pro(tdsSorted.addNoExistTDS(ast));
        pile.doPro(ast,0);
        ArrayList<Integer>m=pile.getPile().get(region);
        //System.out.println("region= "+region);
        int decl=0;
        for(int i=0;i<m.size();i++)
        {
        	
        	TDS tds_i=tdsSorted.getTDSparRegion().get(i);
        	ArrayList<Symbole> syml=tds_i.getSymboles();
        	for(int j=0;j<syml.size();j++)
        	{
        		Symbole s=syml.get(j);
        		//indice de la region
        		if(l.contains(s.getNom()) && (s.getType()!=null && s.getType().equals("boolean")))
        		{
        			//une variable dans l expression est boolean
        			//System.out.println("saluttttttttttttttt");
        			System.err.println("erreur la variable "+s.getNom()+" utilisée pour les indices de "+name+" est booleene");
        	
        		}
        		else
        		{
        			//System.out.println("okokokoko"+s.getNom()+" type:"+s.get);
        		}
        		/*
        		else if(!l.contains(s.getNom()))
        		{
        		System.out.println("erreur la variable "+s.getNom()+" utilisée pour les indices n a pas ete declaree");
        		}
        		*/
        	}
        }
		
		
	}
	
	private void checkExprAff(Tree ast,TDSGlobal tdsSorted,ArrayList<String> l,int region,String name)
	{
		if(l.contains("erreur bool"))
		{
			System.err.println("vous ne pouvez pas assigner un boolean au tableau d'entier "+name);
			return;
		}
		if(l.contains("erreur bool2"))
		{
			System.err.println("vous ne pouvez pas assigner un boolean(expression booleene) au tableau d'entier "+name);
			return;
		}
		Pro pile = new Pro(tdsSorted.addNoExistTDS(ast));
        pile.doPro(ast,0);
        ArrayList<Integer>m=pile.getPile().get(region);
        //System.out.println("region= "+region);
        int decl=0;
        for(int i=0;i<m.size();i++)
        {
        	
        	TDS tds_i=tdsSorted.getTDSparRegion().get(i);
        	ArrayList<Symbole> syml=tds_i.getSymboles();
        	for(int j=0;j<syml.size();j++)
        	{
        		Symbole s=syml.get(j);
        		//indice de la region
        		if(l.contains(s.getNom()) && s.getType()!=null&&s.getType().equals("boolean"))
        		{
        			//une variable dans l expression est boolean
        			System.err.println("erreur la variable "+s.getNom()+" utilisée pour l affectation du tableau "+name+" est booleene");
        	
        		}
        		/*else if(!l.contains(s.getNom()))
        		{
        		System.out.println("erreur la variable "+s.getNom()+" utilisée pour l affectation n a pas ete declaree");
        		}
        		*/
        	}
        }
		
		
	}
	
	
	private void checkDecl(Tree ast,int region,Tree astInit,TDSGlobal tdsSorted,boolean verbose,ArrayList<String>l)
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
					 checkDecl(ast.getChild(i),region,astInit,tdsSorted,verbose,l);
					 reg=0;
					 //return;//on ne traverse qu une seule fois le noeud declaration
				}
				else if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{

					checkDecl(ast.getChild(i),region,astInit,tdsSorted,verbose,l);
					reg=0;
					//return;
				}
				
			}
		}
		
		
		else if(ast.getText().equals("FONCTION")||ast.getText().equals("PROCEDURE") )
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
			
			checkDecl(ast.getChild(i),region,astInit,tdsSorted,verbose,l);
		    
			}
			
			return;
		}
		
		for(int i=0,r=region;i<ast.getChildCount();i++)
		{
		  Tree child_i=ast.getChild(i);
		  if(child_i.getText().equals("FONCTION")||child_i.getText().equals("PROCEDURE"))
		  {
			  reg++;
			  //depList.add(0);
			 
		      checkDecl(ast.getChild(i),reg,astInit,tdsSorted,verbose,l);
		      //ltdpl=0;
		  }
		  else
		  {
			  if(ast.getText().equals("="))
				{    
					 //boolean tab=false;
						if(ast.getChildCount()==3)
						{
							    String id=ast.getChild(0).getText();
							    //System.out.println("yoo2 "+id);
							    //System.out.println("yoor "+region);
							    //System.out.println("yoo2 "+ast.getChild(2).getText());
								//tab=true;
							    System.out.println("==================");
							    Integer wRegion[]={0,0};//contient le numero de region et l'indice du symbole de l'id
							                          //à l endroit ou il a été déclaré
							    boolean check=checkArray(astInit,tdsSorted,region,id,verbose,wRegion);
							    if(check==false)
							    	l.add(id);
							    else
							    {
							    	if(wRegion[0]!=-1)
							    	{
							    		Symbole symbole_array=tdsSorted.getTDSparRegion().get(wRegion[0]).getSymboles().get(wRegion[1]);

							    		ArrayList<String> lAff=new ArrayList<String>();
							    		ArrayList<String> lBr=new ArrayList<String>();
							    		Tree child_Val=ast.getChild(2);
							    		Tree child_Case=ast.getChild(1);
							    		
							    			getSymbole(child_Case,lBr);
							    			getSymbole(child_Val,lAff);
							    		
							    			checkExprBr(astInit,tdsSorted,lBr,region,symbole_array.getNom());
							    			checkExprAff(astInit,tdsSorted,lAff,region,symbole_array.getNom());
							    			System.out.println(symbole_array.getNom());
							    		int dimension=symbole_array.getInfoTableau().getBounds().size();
							    		int dim_used=ast.getChild(1).getChildCount();
							    		checkBounds(symbole_array);
							    		if(dimension!=dim_used)
							    		{
							    			System.err.println("le tableau "+id+" declare a "+dimension+" dimension cependant vous en utilisez "+dim_used);
							    		}
							    	}
							    	
							    }
								
						}
						//System.out.println("yolooooo ");
						return;
				}
			  else
			  {
				  checkDecl(ast.getChild(i),region,astInit,tdsSorted,verbose,l);
			  }
				
		  }
		}
		
	}
	
	private boolean checkArray(Tree ast,TDSGlobal tdsSorted,int region,String name,boolean verbose,Integer wRegion[])
	{
		Pro pile = new Pro(tdsSorted.addNoExistTDS(ast));
        pile.doPro(ast,0);
        ArrayList<Integer>m=pile.getPile().get(region);
        //System.out.println("region= "+region);
        int decl=0;
        for(int i=0;i<m.size();i++)
        {
        	
        	TDS tds_i=tdsSorted.getTDSparRegion().get(i);
        	ArrayList<Symbole> syml=tds_i.getSymboles();
        	for(int j=0;j<syml.size();j++)
        	{
        		Symbole s=syml.get(j);
        		//indice de la region
        		if(s.getNom().equals(name) && s.getType().equals("ARRAY"))
        		{
        			decl++;
        			//indice du symbole
        			wRegion[1]=j;
        			wRegion[0]=i;
        			
        		}
        	}
        }
		

    	if(decl==0)
    	{
    		if(verbose)
    		System.err.println("l'array "+name+" est utilisé mais n est pas déclaré");
    		wRegion[0]=-1;
    		return false;
    	}
    	/*else if(decl>1)
    	{
    		wRegion[0]=-1;
    	}*/
    	return true;
	}
	
	private ArrayList<String> printSemanticDecl(Tree ast,TDSGlobal tdsSorted)
	{
		ArrayList<String> res=new ArrayList<String>();
		checkDecl(ast,0,ast,tdsSorted,true,res);
		return res;
	}
	private ArrayList<String> getIdErrSemanticDecl(Tree ast,TDSGlobal tdsSorted)
	{
		ArrayList<String> res=new ArrayList<String>();
		checkDecl(ast,0,ast,tdsSorted,false,res);
		return res;
	 }
	
	public void PrintArraySemanticError(Tree ast,TDSGlobal tdsSorted)
	{
		printSemanticDecl(ast,tdsSorted);
		printSemanticsErrorDecl(tdsSorted);
		reg=0;
	}
	
	
}
