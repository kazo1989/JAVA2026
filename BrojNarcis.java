// provjeriti da li je uneseni broj narcis

import java.util.Scanner;

public class BrojNarcis {

	public static int brojCifara(int broj) {

		int brojac = 0;

		while (broj != 0) {
			broj = broj / 10;
			brojac++;
		}

		return brojac;

	}

	public static int stepen(int x, int n) {

		int rezultat = 1;

		for (int i = 0; i < n; i++) {
			rezultat = rezultat * x;
		}

		return rezultat;

	}

	public static boolean jeNarcis(int broj) {

		int n = brojCifara(broj);
		int original = broj;
		int suma = 0;

		while (broj != 0) {
			int cifra = broj % 10;
			suma = suma + stepen(cifra, n);
			broj = broj / 10;
		}

		return suma == original;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int broj = sc.nextInt();

		if (jeNarcis(broj)) {
			System.out.println("Broj " + broj + " je narcis.");
		} else {
			System.out.println("Broj " + broj + " nije narcis.");
		}

		sc.close();

	}

}