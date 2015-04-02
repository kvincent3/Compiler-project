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
	}


	private void GetIntoInstruction(Tree ast, int region) 
	{
		for (int j=0;j<ast.getChildCount();j++)
		{
			
			if (ast.getChild(j).getText().equals("="))
			{
			    	String var = ast.getChild(j).getChild(0).getText();
			    	String type = SearchTypeIntoTds(var,region);
			    	if (!type.equals(""))
			    	{
			    		System.out.println("la variable "+var+" est visible");
			    		if (this.Checkexpression(ast.getChild(j).getChild(1),type))
			    		{
			    			System.out.println("l'expression associé à la variable "+var+" renvoi :"+type);
			    		}
			    		else
			    		{
			    			System.out.println("l'expression associé à la variable "+var+" est complètement incorrect");
			    		}
			    	}
			    	/*if (this.IsInteger(ast.getChild(j).getChild(1).getText()))
			    	{
			    		System.out.println(var);
			    		if (CheckIntoTds(var,"integer",region))
			    		{
			    			System.out.println("pas de probleme pour la variable "+var);
			    		}
			    		else
			    		{
			    			System.out.println("Ooups il y un petit problème dans la variable "+var+" : pas déclaré ou pas visible");
			    		}
			    	}*/
			}
		}
	}
	
	private boolean Checkexpression(Tree ast, String type) 
	{
	    if (   ast.getText().equals("+")
	    	|| ast.getText().equals("-")
	    	|| ast.getText().equals("*")
	    	|| ast.getText().equals("/"))
	    {
	    	return Checkexpression( ast.getChild(0), type) && Checkexpression(ast.getChild(1), type);
	    }
	    else if (this.IsInteger(ast.getText()))
	    {
	    	if (type.equals("integer"))
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }
	    //else if ()
		//return iscorrect;
	    return false;
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
