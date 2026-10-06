// provjeriti da li su prva i zadnja cifra broja N iste

import java.util.Scanner;

public class PrvaZadnjaCifra {

	public static void main(String[] args) {

		int N, zadnja, prva;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite N: ");
		N = sc.nextInt();

		N = Math.abs(N);

		zadnja = prva = N % 10;

		N = N / 10;

		while (N != 0) {
			prva = N % 10;
			N = N / 10;
		}

		if (zadnja == prva)
			System.out.print("Iste");
		else
			System.out.print("Razlicite");
		
		sc.close();
	}

}