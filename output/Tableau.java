

public class Tableau {
	String nom;
	String type;
	int numeroRegion;
	int numeroImbrication;
	int deplacement;
	int dimension;
	int bounds[];
	 
	
	public Tableau(String nom,String type,int numeroRegion,int numeroImbrication,int deplacement,int dimension,int[] bounds){
		
		
		super();
		this.nom = nom;
		this.type = type;
		this.numeroRegion = numeroRegion;
		this.numeroImbrication = numeroImbrication;
		this.deplacement = deplacement;
		this.dimension=dimension;
		this.bounds=bounds;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getNumeroRegion() {
		return numeroRegion;
	}


	public void setNumeroRegion(int numeroRegion) {
		this.numeroRegion = numeroRegion;
	}


	public int getNumeroImbrication() {
		return numeroImbrication;
	}


	public void setNumeroImbrication(int numeroImbrication) {
		this.numeroImbrication = numeroImbrication;
	}


	public int getDeplacement() {
		return deplacement;
	}


	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}


	public int getDimension() {
		return dimension;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public int[] getBounds() {
		return bounds;
	}


	public void setBounds(int[] bounds) {
		this.bounds = bounds;
	}
	

		
		
	}

