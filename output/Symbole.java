
public class Symbole {
	String nom;
	String type;
	String parametre;
	String numeroRegion;
	String numeroImbrication;
	
	public Symbole(String nom, String type, String paramtre,
			String numeroRegion, String numeroImbrication) {
		super();
		this.nom = nom;
		this.type = type;
		this.paramtre = paramtre;
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
		return paramtre;
	}
	public void setParamtre(String paramtre) {
		this.paramtre = paramtre;
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
