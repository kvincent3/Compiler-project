
public class Symbole {
	String nom;
	String type;
	int parametre;
	int numeroRegion;
	int numeroImbrication;
	int deplacement;
	
	public Symbole(){
		
	}

	public Symbole(String nom, String type, int parametre, int numeroRegion,
			int numeroImbrication, int deplacement) {
		super();
		this.nom = nom;
		this.type = type;
		this.parametre = parametre;
		this.numeroRegion = numeroRegion;
		this.numeroImbrication = numeroImbrication;
		this.deplacement = deplacement;
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

	
}
