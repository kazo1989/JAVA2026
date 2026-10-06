// provjeriti da li zavjesa prekriva prozor

import java.util.Scanner;

public class ZavjesaProzor {

	public static boolean zavjesaPrekrivaProzor(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		if (x1 <= x3 && x2 >= x4 && y1 >= y3 && y2 <= y4) {

			return true;

		} else {

			return false;

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite x1: ");
		int x1 = sc.nextInt();

		System.out.print("Unesite y1: ");
		int y1 = sc.nextInt();

		System.out.print("Unesite x2: ");
		int x2 = sc.nextInt();

		System.out.print("Unesite y2: ");
		int y2 = sc.nextInt();

		System.out.print("Unesite x3: ");
		int x3 = sc.nextInt();

		System.out.print("Unesite y3: ");
		int y3 = sc.nextInt();

		System.out.print("Unesite x4: ");
		int x4 = sc.nextInt();

		System.out.print("Unesite y4: ");
		int y4 = sc.nextInt();

		boolean pokriva = zavjesaPrekrivaProzor(x1, y1, x2, y2, x3, y3, x4, y4);

		System.out.println(pokriva);

		sc.close();

	}

}