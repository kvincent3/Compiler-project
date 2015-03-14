import java.util.ArrayList;

public class Symbole {
	String nom;
	String type;
	String nature;
	Tableau infotableau;
	int parametre;
	int numeroRegion;
	int numeroImbrication;
	int deplacement;
	private ArrayList<Symbole> params=null;
	
	public Symbole(){
		
	}

	public Symbole(String nom, String nature,String type, int parametre, int numeroRegion,
			int numeroImbrication, int deplacement,Tableau a){
		super();
		this.nom = nom;
		this.type = type;
		this.nature= nature;
		this.parametre = parametre;
		this.numeroRegion = numeroRegion;
		this.numeroImbrication = numeroImbrication;
		this.deplacement = deplacement;
	}
    public void addSymboleParam(Symbole sym)
    {
    	if(params==null)
    		params=new ArrayList<Symbole>();
    	if(sym!=null)
    		params.add(sym);
    	
    }
    public ArrayList<Symbole> getParam()
    {
    	return params;
    }
	public String getNom() {
		return nom;
	}
	public String getNature()
	{
		return this.nature;
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

	public int getParametre() {
		return parametre;
	}

	public void setParametre(int parametre) {
		this.parametre = parametre;
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

	public Tableau getInfoTableau() {
		// TODO Auto-generated method stub
		return this.infotableau;
	}

	
}
