// određivanje najmanjeg i najvećeg broja od tri broja

import java.util.Scanner;

public class NajmanjiNajveciBroj {

	public static void main(String[] args) {

		int a, b, c, min, max;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite a, b i c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;

		max = a;

		if (max < b)
			max = b;
		if (max < c)
			max = c;

		System.out.printf("Najmanji broj je %d, a najveci je %d.", min, max);
		
		sc.close();

	}

}