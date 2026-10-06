// računanje vrijednosti funkcije u zavisnosti od unesenog x, po datim pravilima

import java.util.Scanner;

public class FunkcijaOdX {

	public static void main(String[] args) {

		int x;
		double izl;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite x: ");
		x = sc.nextInt();

		if (x < 1)
			izl = x * x;
		else if (1 <= x && x < 5)
			izl = 2 - x;
		else
			izl = (double) (x * x * x - 1) / 5;

		System.out.printf("f(%d) = %.2f", x, izl);
		
		sc.close();

	}

}