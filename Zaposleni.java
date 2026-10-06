public class Zaposleni {

	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;

	public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
	}


	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public int getGodineStaza() {
		return godineStaza;
	}
	public void setGodineStaza(int godineStaza) {
		if (godineStaza >= 0) {
			this.godineStaza = godineStaza;
		} else {
			System.out.println("Godine staza ne mogu biti negativne.");
		}
	}


	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		if (plata >= 0) {
			this.plata = plata;
		} else {
			System.out.println("Plata ne moze biti negativna.");
		}
	}


	public void povecajPlatu() {
		if (this.plata < 800 && this.godineStaza > 10) {
			this.plata = this.plata * 1.06;
			System.out.println("Plata zaposlenog " + this.ime + " " + this.prezime + " je uvecana za 6%. Nova plata: " + this.plata);
		} else {
			System.out.println("Plata zaposlenog " + this.ime + " " + this.prezime + " nije mijenjana.");
		}
	}


	public void stampa() {
		System.out.println("Ime i prezime: " + this.ime + " " + this.prezime);
		System.out.println("Godine staza: " + this.godineStaza);
		System.out.println("Plata: " + this.plata);
		System.out.println();
	}


	public static void main(String[] args) {

		Zaposleni zaposleni1 = new Zaposleni("Petar", "Kazic", 12, 750);
		Zaposleni zaposleni2 = new Zaposleni("Filip", "Krunic", 5, 700);
		Zaposleni zaposleni3 = new Zaposleni("Pavle", "Drobac", 15, 1200);

		zaposleni1.stampa();
		zaposleni2.stampa();
		zaposleni3.stampa();

		System.out.println("Ime prvog zaposlenog: " + zaposleni1.getIme());
		System.out.println("Prezime drugog zaposlenog: " + zaposleni2.getPrezime());
		System.out.println("Plata treceg zaposlenog: " + zaposleni3.getPlata());
		System.out.println();

		zaposleni2.setIme("Aleksa");
		zaposleni2.setGodineStaza(-3);
		zaposleni2.setGodineStaza(6);
		zaposleni3.setPlata(-100);
		zaposleni3.setPlata(1300);

		System.out.println();
		System.out.println("Nakon izmjena:");
		zaposleni2.stampa();
		zaposleni3.stampa();

		zaposleni1.povecajPlatu();
		zaposleni2.povecajPlatu();
		zaposleni3.povecajPlatu();

		System.out.println();
		zaposleni1.stampa();
	}

}