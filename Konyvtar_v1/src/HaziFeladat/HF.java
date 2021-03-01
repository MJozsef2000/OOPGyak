package HaziFeladat;

import java.util.Scanner;

public class HF {

	public static void main(String[] args) {
		Szemely szemely = new Szemely();
		NevBeolvas(szemely);
		SulyBeolvas(szemely);
		MagassagBeolvas(szemely);
		System.out.println("Az adatok összefûzve:");
		System.out.println(szemely.getNev() + szemely.getSuly() + szemely.getMagassag()
		+ szemely.Alkat());
	}
	
	public static void NevBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		System.out.println("Adja meg a nevét!"); //Nem kell ellenõrzés, a név bármi lehet!
		szemely.setNev(input.nextLine());
	}
	
	public static void SulyBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Adja meg a súlyát");
			while(!input.hasNextInt()) {
				System.out.println("Ez nem szám! Adj nekem súlyt!");
				input.next();
			}
			szemely.setSuly(input.nextInt());
		}while(szemely.getSuly() < 30); //jelen esetben 30 kilónál kevesebb nem lehet a súly!
	}
	
	public static void MagassagBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Adja meg a magasságát (1,5 - 2,3 méter)");
			while(!input.hasNextDouble()) {
				System.out.println("Ez nem szám! Adj nekem magasságot! (szám,szám)");
				input.next();
			}
			szemely.setMagassag(input.nextDouble());
		}while(szemely.getMagassag() < 1.5 || szemely.getMagassag() > 2.3); //jelen esetben 30 kilónál kevesebb nem lehet a súly!
	}

}
