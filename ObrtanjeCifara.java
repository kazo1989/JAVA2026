// ZA DOMACI: obrtanje cifara broja: 873 -> 378

import java.util.Scanner;

public class ObrtanjeCifara {

	public static void main(String[] args) {

		int N, obrnut = 0;
		boolean negativan;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite N: ");
		N = sc.nextInt();

		negativan = N < 0;
		N = Math.abs(N);

		while (N != 0) {
			obrnut = obrnut * 10 + N % 10;
			N = N / 10;
		}

		if (negativan)
			obrnut = -obrnut;

		System.out.printf("Obrnuti broj je %d", obrnut);
		
		sc.close();

	}

}