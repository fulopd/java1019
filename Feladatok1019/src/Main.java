import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// minMax();
		// haromSzamMax();
		// otvenSzazRandom();
		// korKeruletTerulet();
		// bekerKarakterlancot();
		// kutyaElofordulas();

	}

	// 1. feladat:
	static public void minMax() {
		// Készíts programot, mely megjeleníti a képernyőn a rendelkezésünkre
		// álló számtípusok értelmezési tartományának minimumát és maximumát!

		System.out.println("Változók MIN és MAX értékei:");

		System.out.println("Byte Min: " + Byte.MIN_VALUE);
		System.out.println("Byte Max: " + Byte.MAX_VALUE);

		System.out.println("Short Min: " + Short.MIN_VALUE);
		System.out.println("Short Max: " + Short.MAX_VALUE);

		System.out.println("Integer Min: " + Integer.MIN_VALUE);
		System.out.println("Integer Max: " + Integer.MAX_VALUE);

		System.out.println("Long Min: " + Long.MIN_VALUE);
		System.out.println("Long Max: " + Long.MAX_VALUE);

		System.out.println("Float Min: " + Float.MIN_VALUE);
		System.out.println("Float Max: " + Float.MAX_VALUE);

		System.out.println("Double Min: " + Double.MIN_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);

	}

	// 3.feladat
	static public void haromSzamMax() {
		// Írj programot, amely bekér 3 számot a felhasználótól és
		// Integer típusú változókban tárolja el őket! írja ki a legnagyobb szám
		// értékét!
		Scanner sc = new Scanner(System.in);
		int[] szamok = new int[3];

		for (int i = 0; i < szamok.length; i++) {

			System.out.print("Adja meg az " + i + ". számot:");
			szamok[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < szamok.length; i++) {
			if (max < szamok[i]) {
				max = szamok[i];
			}
		}
		System.out.println("A legnagyobb beírt szám: " + max);

	}

	// 4. feladat
	static public void otvenSzazRandom() {
		// Írj programot, amely 50 és 100 közé eső egész véletlenszámot generál,
		// és kiírja azt a képernyőre!
		Random rand = new Random();
		System.out.println(rand.nextInt((100 - 50) + 1) + 50);
	}

	// 5. feladat
	static public void korKeruletTerulet() {
		// Készíts programot, amely bekéri a felhasználótól a kör sugarát
		// (valós szám),
		// és kiszámolja a kör kerületét és területét!
		Scanner sc = new Scanner(System.in);
		double pi = Math.PI;
		System.out.print("Adja meg a kör sugarát: ");
		int r = sc.nextInt();

		double kerulet = 2 * (pi * r);
		double terulet = pi * (Math.pow(r, 2));

		System.out.println("Kerület: " + kerulet + " Terület: " + terulet);

	}

	// 6.feladat
	static public void bekerKarakterlancot() {
		// Írj programot, amely a felhasználótól karakterláncokat
		// kér be (a bekért karakterláncok számát is a felhasználó adhassa meg)!
		// Ezután a program keresse meg és írja ki a képernyőre ezek közül a
		// lexikografikusan legkisebbet!

		Scanner sc = new Scanner(System.in);

		System.out.print("Adja meg hány karakterláncot akar vizsgálni: ");
		int counter = sc.nextInt();
		String[] szovegek = new String[counter];

		for (int i = 0; i < counter; i++) {
			System.out.println(i + 1 + ". szöveg: ");
			String item = sc.next();
			szovegek[i] = item;
		}

		int[] data = new int[counter];
		for (int i = 0; i < szovegek.length; i++) {

			for (int j = i + 1; j < szovegek.length; j++) {

				data[i] += szovegek[i].compareTo(szovegek[j]);

			}
			System.out.println(data[i]);

		}

		int min = Integer.MAX_VALUE;
		int index = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
				index = i;
			}
		}

		System.out.println(szovegek[index]);

	}

	// 7. feladat
	static public void kutyaElofordulas() {
		// Írj programot, amely bekér a felhasználótól egy mondatot,
		// majd kiírja, hányszor szerepel abban a „kutya” szó!

		Scanner sc = new Scanner(System.in);
		System.out.print("Adjon meg egy szöveget: ");
		String szoveg = sc.nextLine();

		String[] eredmeny = szoveg.split(" ");
		System.out.println(szoveg);

		int counter = 0;
		for (String item : eredmeny) {
			if (item.contentEquals("kutya")) {
				counter++;
			}
		}

		System.out.println("kutya :" + counter);

	}
}
