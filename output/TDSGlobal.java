import java.util.ArrayList;


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
		System.out.println(this.TDSparRegion.size());
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
				System.out.println("   "+a.getSymboles().get(j).getNom()+"    |   "
				+a.getSymboles().get(j).getNature()+"  |   "+a.getSymboles().get(j).getType()+"  |   "+
				a.getSymboles().get(j).getParametre()+"    |    "+a.getSymboles().get(j).getNumeroRegion()+"   |   "+a.getSymboles().get(j).getNumeroImbrication()
				+"   |   "+a.getSymboles().get(j).getDeplacement()+"   |   "+a.getSymboles().get(j).getInfoTableau()/*.getDimension()+"  "+a.getSymboles().get(j).getInfoTableau().getBounds()*/);
				System.out.println("-----------------------------------------------------------------------------------------");
			  }
			System.out.println("\n\n\n");
		}
		
	}
}
