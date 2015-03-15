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
	
}
