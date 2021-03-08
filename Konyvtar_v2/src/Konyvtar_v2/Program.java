package Konyvtar_v2;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Konyvtar EsEljoAHalal = new Konyvtar("�s elj� a hal�l", 
				"Agatha Christie", 
				LocalDate.parse( "1944-01-21"), 
                4999);
		Konyvtar DummyKonyv = new Konyvtar("Programming for Dummies", 
				"XY");
		Kiirasok(EsEljoAHalal);
		System.out.println();
		Kiirasok(DummyKonyv);
		
	}
	public static void Kiirasok(Konyvtar Konyv) {
		System.out.println("A k�nyv �ra: " + Konyv.getAr() + "ft");
		Konyv.ArNoveles(30);
		System.out.println("A k�nyv �ra 30% n�vel�s ut�n: " + Konyv.getAr() + "ft");
		System.out.println("A k�nyv c�me: " + Konyv.getCim());
		System.out.println("A k�nyv megjelen�si �ve: " + Konyv.getMegjelenesEv());
		System.out.println("A k�nyv szerz�je: " + Konyv.getSzerzo());
		System.out.println("�sszef�z�tten: " + Konyv.toString());
	}

}