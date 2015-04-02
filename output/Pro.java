import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class Pro 
{
  TDSGlobal tds;
  ArrayList<ArrayList<Integer>> pile = new ArrayList<ArrayList<Integer>>();

  public Pro(TDSGlobal a)
  {
	  this.tds=a;
	  for (int i=0 ; i< a.getTDSparRegion().size() ; i++)
	  {
		  pile.add(new ArrayList<Integer>());
	  }
  }
  
  public  void doPro(Tree ast,int region)
  {
	if (ast.getText().equals("do"))
	{
		pile.get(0).add(0);
		doPro(ast.getChild(0),region);
	}
	else if (ast.getText().equals("DECLARATION"))
	{
		int compteur=0;
		int regCour=0;
		int dernier=0;//la place du dernier bloc
		ArrayList<Integer> enregistrementRegion = new ArrayList<Integer>();
		ArrayList<Integer> enregistrementDernier = new ArrayList<Integer>();		
		for (int i=0;i<ast.getChildCount();i++)
		{
			if (   ast.getChild(i).getText().equals("FONCTION")
				|| ast.getChild(i).getText().equals("PROCEDURE") )
			{   
				if (compteur==0)
				{
				  regCour= region+1;
				  dernier=i;
			    }
				else
				{
				  regCour = getRegionCour(regCour,ast.getChild(dernier));
				  dernier=i;
				}
				enregistrementRegion.add(regCour);
				enregistrementDernier.add(dernier);				
				this.Inserte(this.pile,regCour,region);
				compteur++;
		     }
	     }
		for (int j = 0 ; j< enregistrementDernier.size();j++)
		{
			int v=0;
			if (ast.getChild(enregistrementDernier.get(j)).getText().equals("FONCTION"))
			{
				v=3;
			}
			else if (ast.getChild(enregistrementDernier.get(j)).getText().equals("PROCEDURE"))
			{
				v=2;
			}
			doPro(ast.getChild(enregistrementDernier.get(j)).getChild(v).getChild(0),enregistrementRegion.get(j));//attention ceci marchera que pour les fonctions
		}
	}

  }

private void Inserte(ArrayList<ArrayList<Integer>> pile2, int regCour,int region)
{
	for (int i=0;i<pile2.get(region).size();i++)
	{
		int a = pile2.get(region).get(i);
		pile2.get(regCour).add(a);
	}
	pile2.get(regCour).add(regCour);
}

private int getRegionCour(int regCour, Tree child) {
	// TODO Auto-generated method stub
	int a = regCour+calculNbr(child)+1;
	return a;
}

public void displayPRO()
{
	  for (int i=0 ; i< pile.size() ; i++)
	  {
		  System.out.println("pour region "+i);
		  for (int j=0 ; j< pile.get(i).size() ; j++)
		  {
			  System.out.print(pile.get(i).get(j)+" ");
		  }
		  System.out.println();
	  }
}

public ArrayList<ArrayList<Integer>> getPile()
{
	return this.pile;
}


public static int calculNbr(Tree ast) 
{
	// TODO Auto-generated method stub
	for (int i=0;i<ast.getChildCount();i++)
	{
		if (ast.getChild(i).getText().equals("BLOC"))
		{
			for (int j=0;j<ast.getChild(i).getChild(0).getChildCount();j++)
			{
				if (ast.getChild(i).getChild(0).getChild(j).getText().equals("FONCTION") ||
					ast.getChild(i).getChild(0).getChild(j).getText().equals("PROCEDURE"))
				{
					
					return 1+calculNbr(ast.getChild(i).getChild(0).getChild(j));
				}
			}
		}
	}
	
	return 0;
}
  
  
}
