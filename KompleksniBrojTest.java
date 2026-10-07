// Klasa sa main metodom za klasu KompleksniBroj

import java.util.Scanner;

public class KompleksniBrojTest {

	public static void main(String[] args) {
		
		// double a, b;
		
		Scanner u = new Scanner(System.in);
		
		// System.out.println("Unesi re i im kompleksnog broja: ");
		
		// a = u.nextDouble();
		// b = u.nextDouble();
		
		// KompleksniBroj z1 = new KompleksniBroj(a, b);
		
		// System.out.printf("Re{z} = %.2f\n", z1.dajrealniDio());
		// System.out.printf("Im{z} = %.2f\n", z1.dajimaginarniDio());
		
		KompleksniBroj z1 = new KompleksniBroj(3, 7);
		KompleksniBroj z2 = new KompleksniBroj(-3, 3), z3;
		
		z1.stampaj();
		System.out.println("");
		
		// z1.postaviRealniDio(a);
		// z1.postaviImaginarniDio(b);
		
		// System.out.printf("Re{z} = %.2f\n", z1.dajrealniDio());
		// System.out.printf("Im{z} = %.2f\n", z1.dajimaginarniDio());
		
		// z1.stampaj();
		
		System.out.printf("|Z| = %.2f\n", z1.modulo());
		
		z3 = z1.saberi(z2);
		z3.stampaj();
		System.out.println("");
		System.out.println("");
		
		System.out.print("Unesi broj elemenata niza: ");
		int N = u.nextInt();
		
		KompleksniBroj niz[] = new KompleksniBroj[N];
		
		for(int i = 0; i < N; i++){
			
			System.out.printf("Unesi %d element niza: ", i+1);
			niz[i] = new KompleksniBroj(u.nextDouble(),u.nextDouble());
			
		}
		
		KompleksniBroj maks;
		maks = niz[0];
		
		for(int i = 1; i<N; i++)
			if (maks.modulo()<niz[i].modulo())
				maks = niz[i];
		
		System.out.print("Maksimum niza je: ");
		maks.stampaj();
		System.out.println("");
		
		u.close();
	
	}
		
		

}
