// računanje faktorijela broja N

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {

		int N;
		long p = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite N: ");
		N = sc.nextInt();

		for (int i = 2; i <= N; i++)
			p *= i;

		System.out.printf("%d! = %d", N, p);
		
		sc.close();

	}

}