package Konyvtar_v1;

public class Konyvtar {
	private String Cim;
	private String Szerzo;
	private int MegjelenesEv;
	private double Ar;
	
	public void ArNoveles(double Szazalek) {
		this.Ar += this.Ar * (Szazalek/100);
	}
	
	public String Osszefuzes() {
		return Cim+Szerzo+MegjelenesEv+Ar;
	}
	
	public void setCim(String cim) {
		this.Cim = cim;
	}
	public String getCim() {
		return this.Cim;
	}
	
	public void setSzerzo(String szerzo) {
		this.Szerzo = szerzo;
	}
	public String getSzerzo() {
		return this.Szerzo;
	}
	
	public void setMegjelenesEv(int ev) {
		this.MegjelenesEv = ev;
	}
	public int getMegjelenesEv() {
		return this.MegjelenesEv;
	}
	
	public void setAr(double ar) {
		this.Ar = ar;
	}
	public double getAr() {
		return this.Ar;
	}
	
}
