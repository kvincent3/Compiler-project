import java.util.ArrayList;



public class Tableau {
	int dimension;
	ArrayList<int[]> bounds = new ArrayList<int[]>();
	public Tableau()
	{
		
	}


	public int getDimension() {
		return dimension;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public ArrayList<int[]> getBounds(){
		return bounds;
	}


	public void addBounds(int[] bounds){
		this.bounds.add(bounds);
	}
	

		
		
	}

