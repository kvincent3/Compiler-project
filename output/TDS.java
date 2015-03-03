import java.util.ArrayList;


public class TDS {
	ArrayList<Symbole> variable = new ArrayList<Symbole>();
	ArrayList<Symbole> fonction = new ArrayList<Symbole>();
	ArrayList<Symbole> procedure = new ArrayList<Symbole>();
	
	public TDS(ArrayList<Symbole> variable, ArrayList<Symbole> fonction,
			ArrayList<Symbole> procedure) {
		super();
		this.variable = variable;
		this.fonction = fonction;
		this.procedure = procedure;
	}
	
	public ArrayList<Symbole> getVariable() {
		return variable;
	}
	public void setVariable(ArrayList<Symbole> variable) {
		this.variable = variable;
	}
	public ArrayList<Symbole> getFonction() {
		return fonction;
	}
	public void setFonction(ArrayList<Symbole> fonction) {
		this.fonction = fonction;
	}
	public ArrayList<Symbole> getProcedure() {
		return procedure;
	}
	public void setProcedure(ArrayList<Symbole> procedure) {
		this.procedure = procedure;
	}
	
	
}
