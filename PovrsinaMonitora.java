// izracunati povrsinu ekrana monitora na osnovu dijagonale i odnosa stranica (aspect ratio)

public class PovrsinaMonitora {

	public static double povrsina(double a, double b, double d) {

		double k = Math.sqrt(d * d / (a * a + b * b));

		double stranicaA = a * k;
		double stranicaB = b * k;

		return stranicaA * stranicaB;

	}

	public static void main(String[] args) {

		double a = 16;
		double b = 9;
		double d = 12;

		double rez = povrsina(a, b, d);

		System.out.println(rez);

	}

}