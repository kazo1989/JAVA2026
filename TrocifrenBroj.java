// razlika proizvoda i zbira cifara trocifrenog broja

import java.util.Scanner;

public class TrocifrenBroj {

	public static int sifra(int n) {

		int stotina = n / 100;
		int desetina = (n / 10) % 10;
		int jedinica = n % 10;

		int proizvod = stotina * desetina * jedinica;
		int zbir = stotina + desetina + jedinica;

		int sifra = proizvod - zbir;
		return sifra;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite trocifreni broj: ");

		int broj = sc.nextInt();

		int rezultat = sifra(broj);

		System.out.println(rezultat);

		sc.close();

	}

}