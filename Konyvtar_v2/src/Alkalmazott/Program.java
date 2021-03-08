package Alkalmazott;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Alkalmazott A = new Alkalmazott("János", 10000);
		Alkalmazott B = new Alkalmazott("Anita");
		A.IncPay(2000); //Fizetésnövelés
		System.out.println(A.GettName() + " fizetése: " + A.GetPay() + "ft");
		System.out.println(B.GettName() + " fizetése: " + B.GetPay() + "ft");
		System.out.println(A.GettName() + " adója: " + A.Tax() + "ft");
		System.out.println(B.GettName() + " adója: " + B.Tax() + "ft");
		if (A.NagyobbFizetes(B))
			System.out.println(B.GettName() + " fizetése nagyobb mint " + A.GettName() + " fizetése");
		else
			System.out.println(A.GettName() + " fizetése nagyobb mint " + B.GettName() + " fizetése");
		System.out.println(A.toString());
		System.out.println(B.toString());
		Alkalmazott[] Alkalmazottak = new Alkalmazott[5];
		Feltolt(Alkalmazottak);
		System.out.println("A legnagyobb fizetés: " + LegnagyobbFizetes(Alkalmazottak).toString());
		System.out.println("100 és 2000 forint közé esõ fizetések száma: "+ HanyHataros(Alkalmazottak));
		System.out.println("Átlagfizetés: " + AtlagFizetes(Alkalmazottak));
		System.out.println("Összadó: " + OsszAdo(Alkalmazottak));
	}

	public static void Feltolt(Alkalmazott[] alkalmazottak) {
		Scanner input = new Scanner(System.in);
		int Money = 0;
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			System.out.println("Adja meg az alkalmazott nevét!");
			alkalmazottak[i].SetName(input.nextLine());
			do
			{
				System.out.println("Adja meg a fizetését!");
				while(!input.hasNextInt())
				{
					System.out.println("Ez nem megfelelõ bemenet! Adjon újat!");
					input.next();
				}
				Money = input.nextInt();
			}while(Money < 1);
			input.nextLine();
			alkalmazottak[i].SetPay(Money);
 		}
	}
	
	public static void Test(Alkalmazott[] alkalmazottak) {
		for(Alkalmazott a : alkalmazottak) {
			System.out.println(a.GettName() + " " + a.GetPay());
		}
	}
	
	public static Alkalmazott LegnagyobbFizetes(Alkalmazott[] alkalmazottak) {
		Alkalmazott max = alkalmazottak[0];
		for (int i=1; i<alkalmazottak.length; i++) {
			if (max.GetPay() < alkalmazottak[i].GetPay())
				max = alkalmazottak[i];
		}
		return max;
	}
	
	public static int HanyHataros(Alkalmazott[] alkalmazottak) {
		int db=0;
		for (Alkalmazott a : alkalmazottak) {
			if (a.GetFizetesHatarok(100, 2000)) db++;
		}
		return db;
	}
	
	public static double AtlagFizetes(Alkalmazott[] alkalmazottak) {
		double sum = 0;
		for (int i=0; i<alkalmazottak.length; i++) {
			sum += (double)alkalmazottak[i].GetPay();
		}
		return sum/alkalmazottak.length;
	}
	
	public static double OsszAdo(Alkalmazott[] alkalmazottak) {
		double sum = 0;
		for (int i=0; i<alkalmazottak.length; i++) {
			sum += (double)alkalmazottak[i].Tax();
		}
		return sum;
	}
}
