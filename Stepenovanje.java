// stepenovanje broja x brojem n

public class Stepenovanje {

	public static int stepen(int x, int n) {
		int rezultat = 1;

		for (int i = 0; i < n; i++) {
			rezultat = rezultat * x;
		}

		return rezultat;
	}

	public static void main(String[] args) {

		int x = 4;
		int n = 3;

		int rez = stepen(x, n);

		System.out.println(rez);

	}

}