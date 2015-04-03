package compile;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class SemanticsTab {

	int reg=0;
	public SemanticsTab()
	{
		
	}
	//ctrls 1
	public void printSemanticsErrorDecl(TDSGlobal tdsSorted)
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
			System.out.print("l'array : "+ names.get(i)+" a été declaré plusieurs fois\n");
		}
			
	}
	//ctrls 2
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
	
	private void printSemanticsAffect2(Tree ast,boolean ent,String name)
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
					printSemanticsAffect2(ast.getChild(i),false,name);
					 
					 return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					printSemanticsAffect2(ast.getChild(i),false,name);
					
					return;
				}
			
		}
	  }
		
		if(ast.getText().equals("="))
		{
			 //boolean tab=false;
				if(ast.getChildCount()==3)
				{
					    String id=ast.getChild(0).getText();
					    //System.out.println("yoo2 "+id);
					    //System.out.println("yoo2 "+ast.getChild(1).getText());
					    //System.out.println("yoo2 "+ast.getChild(2).getText());
						//tab=true;
						printSemanticsAffect2(ast.getChild(1),true,id);//CASE
						printSemanticsAffect2(ast.getChild(2),true,id);//VAL
				}
				//System.out.println("yolooooo ");
				return;
		}
		
		
		for(int i=0;i<ast.getChildCount();i++)
		{
			if(ent==false)
			printSemanticsAffect2(ast.getChild(i),ent,name);
			else if((ast.getChild(i).getText().equals("false")||ast.getChild(i).getText().equals("true")) && (ent==true))
		 {
			System.out.println("l'affectation du tableau "+name+" est incorrecte");
			if(ast.getText().equals("VAL"))
			{
				System.out.println("vous ne pouvez pas assigner un boolean a un tableau d'entier");
			}
			if(ast.getText().equals("CASE"))
			{
				System.out.println("vous ne pouvez pas mettre comme indice un boolean ");
			}
			return;
		}
		}
		return;
		//if(ast.)
		
		
	}
	
	
	public void printSemanticsAffect(Tree ast)
	{
		printSemanticsAffect2(ast,false,"");
	}
	
	
	
	public void checkDecl(Tree ast,int region,Tree astInit,TDSGlobal tdsSorted)
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
					 checkDecl(ast.getChild(i),region,astInit,tdsSorted);
					 reg=0;
					 return;//on ne traverse qu une seule fois le noeud declaration
				}
				if(ast.getChild(i).getText().equals("INSTRUCTION"))
				{
					checkDecl(ast.getChild(i),region,astInit,tdsSorted);
					reg=0;
					return;
				}
			}
		}
		
		
		else if(ast.getText().equals("FONCTION")||ast.getText().equals("PROCEDURE") )
		{
			for(int i=0;i<ast.getChildCount();i++)
			{
			
			checkDecl(ast.getChild(i),region,astInit,tdsSorted);
		    
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
			 
		      checkDecl(ast.getChild(i),reg,astInit,tdsSorted);
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
							    checkArray(astInit,tdsSorted,region,id);
								
						}
						//System.out.println("yolooooo ");
						return;
				}
			  else
			  {
				  checkDecl(ast.getChild(i),region,astInit,tdsSorted);
			  }
				
		  }
		}
		
	}
	
	public void checkArray(Tree ast,TDSGlobal tdsSorted,int region,String name)
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
        		
        		if(s.getNom().equals(name) && s.getType().equals("ARRAY"))
        		{
        			decl++;
        		}
        	}
        }
		

    	if(decl==0)
    	{
    		System.out.println("l'array "+name+" est utilisé mais n est pas déclaré");
    	}
	}
	
	public void printSemanticDecl(Tree ast,TDSGlobal tdsSorted)
	{
		checkDecl(ast,0,ast,tdsSorted);
	}
	
}
