package Konyvtar_v1;

public class Program {

	public static void main(String[] args) {
		Konyvtar konyvtar = new Konyvtar();
		konyvtar.setAr(3500);
		System.out.println("A k�nyv �ra: "+ konyvtar.getAr() + "ft");
		konyvtar.ArNoveles(30);
		System.out.println("A k�nyv �ra 30% n�vel�s ut�n: "+ konyvtar.getAr() + "ft");
		konyvtar.setCim("�s elj� a hal�l...");
		System.out.println("A k�nyv c�me: " + konyvtar.getCim());
		konyvtar.setMegjelenesEv(1944);
		System.out.println("A k�nyv megjelen�si �ve: " + konyvtar.getMegjelenesEv());
		konyvtar.setSzerzo("Agatha Christie");
		System.out.println("A k�nyv szerz�je: " + konyvtar.getSzerzo());
		System.out.println("�sszef�z�tten: " + konyvtar.Osszefuzes());
	}

}
