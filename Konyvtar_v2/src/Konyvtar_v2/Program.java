package Konyvtar_v2;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Konyvtar EsEljoAHalal = new Konyvtar("És eljõ a halál", 
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
		System.out.println("A könyv ára: " + Konyv.getAr() + "ft");
		Konyv.ArNoveles(30);
		System.out.println("A könyv ára 30% növelés után: " + Konyv.getAr() + "ft");
		System.out.println("A könyv címe: " + Konyv.getCim());
		System.out.println("A könyv megjelenési éve: " + Konyv.getMegjelenesEv());
		System.out.println("A könyv szerzõje: " + Konyv.getSzerzo());
		System.out.println("Összefûzötten: " + Konyv.toString());
	}

}