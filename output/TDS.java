import java.util.ArrayList;


public class TDS {
	String nom;
	ArrayList<Symbole> variable = new ArrayList<Symbole>();
	
	public TDS(String nom, ArrayList<Symbole> variable) {
		super();
		this.nom = nom;
		this.variable = variable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Symbole> getVariable() {
		return variable;
	}

	public void setVariable(ArrayList<Symbole> variable) {
		this.variable = variable;
	}
	
}
