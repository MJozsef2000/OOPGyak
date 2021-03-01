package HaziFeladat;

public class Szemely {
	private String nev;
	private int suly; //eg�sz, kg-ban megadva
	private double magassag;
	
	//Getter Setter
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getNev() {
		return this.nev;
	}
	public void setSuly(int suly) {
		this.suly = suly;
	}
	public int getSuly() {
		return this.suly;
	}
	public void setMagassag(double magassag) {
		this.magassag = magassag; //Centim�ter-b�l m�terbe
	}
	public double getMagassag() {
		return this.magassag;
	}
	//Getter Setter v�ge
	
	//Met�dusok
	private double TTI() {
		return (double)suly/(magassag*magassag);
	}
	
	public String Alkat() {
		if (TTI() < 18.5) return "sov�ny";
		else
			if (TTI() > 25) return "k�v�r";
				else
					return "norm�l";
	}
	
	public String Osszefuzes() {
		return nev+suly+magassag+"tti: "+Alkat();
	}
	//Met�dusok v�ge
}
