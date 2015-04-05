
import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;


public class TDSGlobal {
	ArrayList<TDS> TDSparRegion = new ArrayList<TDS>();

	public TDSGlobal(){
		
	}
	
	public TDSGlobal(ArrayList<TDS> tDSparRegion) {
		super();
		TDSparRegion = tDSparRegion;
	}

	public ArrayList<TDS> getTDSparRegion() {
		return TDSparRegion;
	}

	public void setTDSparRegion(ArrayList<TDS> tDSparRegion) {
		TDSparRegion = tDSparRegion;
	}
	
	public void display()
	{
		for (int i=0;i<this.TDSparRegion.size();i++)
		{
			TDS a=this.TDSparRegion.get(i);
			
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("|                                 TDS region "+a.getregion()+"               	                        |");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("| nom  | nature | type | Param | Numregion | NumImbrication | deplacement | infoTableau |");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("-----------------------------------------------------------------------------------------");
			for (int j=0;j<a.getSymboles().size();j++)
			  {
				System.out.print("|");
				if (a.getSymboles().get(j).getInfoTableau() == null)
				{
					System.out.println("   "+a.getSymboles().get(j).getNom()+"    |   "
					+a.getSymboles().get(j).getNature()+"  |   "+a.getSymboles().get(j).getType()+"  |   "+
					a.getSymboles().get(j).getParametre()+"    |    "+a.getSymboles().get(j).getNumeroRegion()+"   |   "+a.getSymboles().get(j).getNumeroImbrication()
					+"   |   "+a.getSymboles().get(j).getDeplacement()+"   |   "+a.getSymboles().get(j).getInfoTableau()/*.getDimension()+"  "+a.getSymboles().get(j).getInfoTableau().getBounds()*/);
					System.out.println("-----------------------------------------------------------------------------------------");
				}
				else 
				{
					System.out.print("   "+a.getSymboles().get(j).getNom()+"    |   "
					+a.getSymboles().get(j).getNature()+"  |   "+a.getSymboles().get(j).getType()+"  |   "+
					a.getSymboles().get(j).getParametre()+"    |    "+a.getSymboles().get(j).getNumeroRegion()+"   |   "+a.getSymboles().get(j).getNumeroImbrication()
					+"   |   "+a.getSymboles().get(j).getDeplacement()+"   |   "+a.getSymboles().get(j).getInfoTableau().getDimension()+"->");
					for (int f=0;f<a.getSymboles().get(j).getInfoTableau().getBounds().size();f++)
					{
						int a1 = a.getSymboles().get(j).getInfoTableau().getBounds().get(f)[0];
						int b1 = a.getSymboles().get(j).getInfoTableau().getBounds().get(f)[1];
						System.out.print("["+a1+","+b1+"] ;");
					}
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------");	
				}
			  }
			System.out.println("\n\n\n");
		}
		
	}

	public void sort() 
	{
		boolean trie =false;
			while (!trie)
			{
				trie =true;
				for (int i = 1 ; i< this.getTDSparRegion().size();i++)
				{
					if (this.getTDSparRegion().get(i).getregion() < this.getTDSparRegion().get(i-1).getregion())
					{
						TDS temp = this.getTDSparRegion().get(i);
						this.getTDSparRegion().set(i,this.getTDSparRegion().get(i-1));
						this.getTDSparRegion().set(i-1,temp);
						trie =false;
					}
				}
			}

	}
 
	public TDSGlobal addNoExistTDS(Tree ast) 
	{
		
		
		int max = this.CountRegion(ast);
		//System.out.println("===========>"+max);
		TDSGlobal tdsFin = new TDSGlobal();
		ArrayList<TDS> TDSfinal = new ArrayList<TDS>();
		for (int i=0;i<max;i++)
		{
			if (Ispresent(i))
			{
				for (int v=0;v<this.TDSparRegion.size();v++)
				{
					if (this.TDSparRegion.get(v).getregion()==i)
					{
						TDSfinal.add(this.TDSparRegion.get(v));
						v=this.TDSparRegion.size();
					}
				}
				
			}
			else
			{
				TDSfinal.add(new TDS(i));
			}
		}
		tdsFin.setTDSparRegion(TDSfinal);
		//tdsFin.display();
		return tdsFin;
		
	}

   
	private int CountRegion(Tree ast)
    {
		int sum=0;
        for (int i=0 ;i <ast.getChild(0).getChildCount();i++)
        {
        	if (ast.getChild(0).getChild(i).getText().equals("FONCTION")
        		|| ast.getChild(0).getChild(i).getText().equals("PROCEDURE"))
        	{
        		sum=sum+Pro.calculNbr(ast.getChild(0).getChild(i))+1;
        	}
        }
        return sum+1;
    }
    
    
	private boolean Ispresent(int region) 
	{
		// TODO Auto-generated method stub
		boolean res = false;
		for (int in = 0;in<this.TDSparRegion.size();in++)
		{
			if (this.TDSparRegion.get(in).getregion() == region)
			{
				res =true;
			}
		}
		return res;
	}
}
