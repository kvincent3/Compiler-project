
public class Symbole {
	String nom;
	String type;
	String parametre;
	String numeroRegion;
	String numeroImbrication;
	
	public Symbole(){
		
	}
	public Symbole(String nom, String type, String paramtre,
			String numeroRegion, String numeroImbrication) {
		super();
		this.nom = nom;
		this.type = type;
		this.parametre = paramtre;
		this.numeroRegion = numeroRegion;
		this.numeroImbrication = numeroImbrication;
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
	public String getParamtre() {
		return parametre;
	}
	public void setParamtre(String paramtre) {
		this.parametre = paramtre;
	}
	public String getNumeroRegion() {
		return numeroRegion;
	}
	public void setNumeroRegion(String numeroRegion) {
		this.numeroRegion = numeroRegion;
	}
	public String getNumeroImbrication() {
		return numeroImbrication;
	}
	public void setNumeroImbrication(String numeroImbrication) {
		this.numeroImbrication = numeroImbrication;
	}

	
	
}
