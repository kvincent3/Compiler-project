
public class FonctionRegion 
{
	private int regionApplelante;
	private String nomFonction;
	private String codeFonction;
	
	public String getCodeFonction() {
		return codeFonction;
	}
	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}
	public FonctionRegion(String nomFonction,int regionApplelante)
	{
		this.regionApplelante = regionApplelante;
		this.nomFonction = nomFonction;
	}
	public int getRegionApplelante() {
		return regionApplelante;
	}
	public void setRegionApplelante(int regionApplelante) {
		this.regionApplelante = regionApplelante;
	}
	public String getNomFonction(){
		return nomFonction;
	}
	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}


}
