package HaziFeladat;

public class Szemely {
	private String nev;
	private int suly; //egész, kg-ban megadva
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
		this.magassag = magassag; //Centiméter-bõl méterbe
	}
	public double getMagassag() {
		return this.magassag;
	}
	//Getter Setter vége
	
	//Metódusok
	private double TTI() {
		return (double)suly/(magassag*magassag);
	}
	
	public String Alkat() {
		if (TTI() < 18.5) return "sovány";
		else
			if (TTI() > 25) return "kövér";
				else
					return "normál";
	}
	
	public String Osszefuzes() {
		return nev+suly+magassag+"tti: "+Alkat();
	}
	//Metódusok vége
}
