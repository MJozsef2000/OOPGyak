package HaziFeladat;

import java.util.Scanner;

public class HF {

	public static void main(String[] args) {
		Szemely szemely = new Szemely();
		NevBeolvas(szemely);
		SulyBeolvas(szemely);
		MagassagBeolvas(szemely);
		System.out.println("Az adatok �sszef�zve:");
		System.out.println(szemely.getNev() + szemely.getSuly() + szemely.getMagassag()
		+ szemely.Alkat());
	}
	
	public static void NevBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		System.out.println("Adja meg a nev�t!"); //Nem kell ellen�rz�s, a n�v b�rmi lehet!
		szemely.setNev(input.nextLine());
	}
	
	public static void SulyBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Adja meg a s�ly�t");
			while(!input.hasNextInt()) {
				System.out.println("Ez nem sz�m! Adj nekem s�lyt!");
				input.next();
			}
			szemely.setSuly(input.nextInt());
		}while(szemely.getSuly() < 30); //jelen esetben 30 kil�n�l kevesebb nem lehet a s�ly!
	}
	
	public static void MagassagBeolvas(Szemely szemely) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Adja meg a magass�g�t (1,5 - 2,3 m�ter)");
			while(!input.hasNextDouble()) {
				System.out.println("Ez nem sz�m! Adj nekem magass�got! (sz�m,sz�m)");
				input.next();
			}
			szemely.setMagassag(input.nextDouble());
		}while(szemely.getMagassag() < 1.5 || szemely.getMagassag() > 2.3); //jelen esetben 30 kil�n�l kevesebb nem lehet a s�ly!
	}

}
