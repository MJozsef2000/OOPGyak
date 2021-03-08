package Konyvtar_v2;

import java.time.LocalDate;

public class Konyvtar {
	private String Cim;
	private String Szerzo;
	private LocalDate Megjelenes;
	private double Ar;

	public Konyvtar(String Cim, String Szerzo, LocalDate Megjelenes, double Ar) {
		this.Cim = Cim;
		this.Szerzo = Szerzo;
		this.Megjelenes = Megjelenes;
		this.Ar = Ar;
	}
	
	public Konyvtar(String Cim, String Szerzo) {
		this(Cim, Szerzo, LocalDate.now(), 2500);
	}
	
	public void ArNoveles(double Szazalek) {
		this.Ar += this.Ar * (Szazalek / 100);
	}
	@Override
	public String toString() {
		return "Cím: " + Cim + " Szerzõ: " + Szerzo + " Megjelenés dátuma: " + Megjelenes + " A könyv ára: " + Ar;
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

	public void setMegjelenesEv(LocalDate ev) {
		this.Megjelenes = ev;
	}

	public LocalDate getMegjelenesEv() {
		return this.Megjelenes;
	}

	public void setAr(double ar) {
		this.Ar = ar;
	}

	public double getAr() {
		return this.Ar;
	}

}
