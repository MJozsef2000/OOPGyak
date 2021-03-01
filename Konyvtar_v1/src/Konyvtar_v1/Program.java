package Konyvtar_v1;

public class Program {

	public static void main(String[] args) {
		Konyvtar konyvtar = new Konyvtar();
		konyvtar.setAr(3500);
		System.out.println("A könyv ára: "+ konyvtar.getAr() + "ft");
		konyvtar.ArNoveles(30);
		System.out.println("A könyv ára 30% növelés után: "+ konyvtar.getAr() + "ft");
		konyvtar.setCim("És eljõ a halál...");
		System.out.println("A könyv címe: " + konyvtar.getCim());
		konyvtar.setMegjelenesEv(1944);
		System.out.println("A könyv megjelenési éve: " + konyvtar.getMegjelenesEv());
		konyvtar.setSzerzo("Agatha Christie");
		System.out.println("A könyv szerzõje: " + konyvtar.getSzerzo());
		System.out.println("Összefûzötten: " + konyvtar.Osszefuzes());
	}

}
