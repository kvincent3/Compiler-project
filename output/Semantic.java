import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class Semantic 
{
	Pro pro;
	TDSGlobal tdsglobale;
	public Semantic(Pro p,TDSGlobal tdsg)
	{
		this.pro=p;
		this.tdsglobale=tdsg;
	}
	
	
	public void CheckVisibilityVariable(Tree ast,int region)
	{
		for (int i = 0; i<ast.getChildCount();i++)
		{
			
			if (ast.getChild(i).getText().equals("INSTRUCTION"))
			{
				GetIntoInstruction(ast.getChild(i),region);
			}

		}
		for (int i=0;i<ast.getChildCount();i++)
		{
			 if (ast.getChild(i).getText().equals("DECLARATION"))
			{
				CheckVisibilityVariable(ast.getChild(i),region);
			}
			else if (ast.getChild(i).getText().equals("FONCTION") || ast.getChild(i).getText().equals("PROCEDURE"))
			{
				CheckVisibilityVariable(ast.getChild(i),++region);
			}
			else if (ast.getChild(i).getText().equals("BLOC"))
			{
				CheckVisibilityVariable(ast.getChild(i),region);
			}
		}
	}


	private void GetIntoInstruction(Tree ast, int region) 
	{
		for (int j=0;j<ast.getChildCount();j++)
		{
			
			if (ast.getChild(j).getText().equals("="))
			{
			    	String var = ast.getChild(j).getChild(0).getText();
			    	String type = SearchTypeIntoTds(var,region);
			    	if (type.equals(""))
			    	{
			    		System.err.println("Dans la région "+region+" La variable \""+var+"\" n'est pas déclarée ou n'est pas visible");
				    	ArrayList<Boolean> bool = new ArrayList<Boolean>();
				    	this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
				    	System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
			    	}
			    	else if (type.equals("ARRAY"))
			    	{
			    		   System.out.println("Dans la région "+region+" la variable "+var+" est visible");
					       ArrayList<Boolean> bool = new ArrayList<Boolean>();
					       for (int i=0;i<ast.getChild(j).getChildCount();i++)
					       {
					    	   if (ast.getChild(j).getChild(i).getText().equals("VAL"))
					    	   {
					    	     this.Checkexpression(ast.getChild(j).getChild(i).getChild(0),type,region,bool);
					    	   }
					       }
					       if (this.semantiqueEstCorrect(bool))
					       {
					    	   System.out.println("Dans la région "+region+" l'expression associé à la variable "+var+" est correct et type de renvoi :"+type);
					       }
					       else
					       {
					    	   System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
					       }
			    	}
			    	else
			    	{
			    	   System.out.println("Dans la région "+region+" la variable "+var+" est visible");
				       ArrayList<Boolean> bool = new ArrayList<Boolean>();
				       this.Checkexpression(ast.getChild(j).getChild(1),type,region,bool);
				       if (this.semantiqueEstCorrect(bool))
				       {
				    	   System.out.println("Dans la région "+region+" l'expression associé à la variable "+var+" est correct et type de renvoi :"+type);
				       }
				       else
				       {
				    	   System.err.println("Dans la région "+region+" l'expression associé à la variable \""+var+"\" est complètement incorrect");
				       }
			    	}


			  }
			else
			{
				GetIntoInstruction(ast.getChild(j), region);
			}
		}
	}
	
	private boolean semantiqueEstCorrect(ArrayList<Boolean> bool) {
		for (int i=0;i<bool.size();i++)
		{
			if (!bool.get(i))
			{
				return false;
			}
		}
		return true;
	}


	private void Checkexpression(Tree ast, String type,int region,ArrayList<Boolean> b) 
	{
		if (type.equals("integer") || type.equals("ARRAY"))
		{
		       if (   ast.getText().equals("+")
		    	|| ast.getText().equals("-")
		    	|| ast.getText().equals("*")
		    	|| ast.getText().equals("/"))
		        {
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		        }
		    else if (this.IsInteger(ast.getText()))
		    {
		    	if (type.equals(type))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		b.add(false);
		    	}
		    }
		    else if (ast.getText().equals("APPEL"))
		    {
		    	String app =ast.getChild(0).getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (app_type.equals("integer") || app_type.equals("ARRAY"))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
		    		b.add(false);
		    	}
		    }
		    else if (ast.getText().equals("TABLEAU")) // les tableaux sont forcément des entiers on verifie juste qu'il est visible
		    {
		    	String app =ast.getChild(0).getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (!app_type.equals(""))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("Dans la région "+region+" le tableau "+ app + " n'est pas déclaré");
		    		b.add(false);
		    	}
		    }
		    else //c'est une variable
		    {
		    	String app =ast.getText();
		    	String app_type = this.SearchTypeIntoTds(app, region);
		    	if (app_type.equals("integer"))
		    	{
		    		b.add(true);
		    	}
		    	else
		    	{
		    		System.err.println("Dans la région "+region+" la variable "+ app + " n'est pas déclarée ou ne renvoie pas le bon type");
		    		b.add(false);
		    	}
		    }
		}
		else if (type.equals("boolean"))
		{
		       if (   ast.getText().equals("+")
		    	|| ast.getText().equals("-")
		    	|| ast.getText().equals("*"))
		        {
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		        }
		       else if (ast.getText().equals("/"))
		       {
		    	   System.err.println("Dans la region "+region+" on ne divise pas des booléens");
		    	   Checkexpression( ast.getChild(0), type,region,b);
		    	   Checkexpression(ast.getChild(1), type,region,b);
		       }
		       else if (ast.getText().equals("true") ||
		    		    ast.getText().equals("false"))
		       {
		    	   b.add(true);
		       }
		       else if (ast.getText().equals("APPEL"))
			    {
			    	String app =ast.getChild(0).getText();
			    	String app_type = this.SearchTypeIntoTds(app, region);
			    	if (app_type.equals(type))
			    	{
			    		b.add(true);
			    	}
			    	else
			    	{
			    		System.err.println("dans la region "+ region+" La fonction ou procedure "+ app +" n'est pas déclaré ou pas visible ou ne renvoie pas le bon type");
			    		b.add(false);
			    	}
			    }
			    else if (ast.getText().equals("TABLEAU")) // les tableaux sont forcément des entiers on verifie juste qu'il est visible
			    {
			    	b.add(false);
			    	System.err.println("Dans la region "+region+" on ne peut pas évaluer des booléens avec des entiers");
			    }
			    else if (this.IsInteger(ast.getText()))
			    {
			    	System.err.println("Dans la region "+region+" on ne pas peut évaluer des booléens avec des entiers");
			    	b.add(false);
			    }
		       else //c'est une variable
			    {
			    	String app =ast.getText();
			    	String app_type = this.SearchTypeIntoTds(app, region);
			    	if (!app_type.equals(""))
			    	{
			    		b.add(true);
			    	}
			    	else
			    	{
			    		System.err.println("Dans la région "+region+" la variable "+ app + " n'est pas déclarée");
			    		b.add(false);
			    	}
			    }
		}

	}


	private String SearchTypeIntoTds(String var, int region) 
	{
		ArrayList<Integer> pile_reg_ouv = new ArrayList<Integer>();
		pile_reg_ouv=this.pro.getPile().get(region);
		String type="";
		for (int i = 0; i< pile_reg_ouv.size();i++)
		{
			TDS courant = this.tdsglobale.TDSparRegion.get(pile_reg_ouv.get(i));
			for (int j=0;j<courant.getSymboles().size();j++)
			{
				
				if (courant.getSymboles().get(j).getNom().equals(var))
				{
					type=courant.getSymboles().get(j).getType();
				}
			}
		}
		return type;
	}


	private boolean IsInteger(String cc/*chaine de caractaire*/){
		char [] s =cc.toCharArray();
		boolean testerreurfrappe= true;

		for (int i=0; i<s.length;i++){
		if(!Character.isDigit(s[i]) )
		{testerreurfrappe= false;}
		}
		return testerreurfrappe;
		} 
}
