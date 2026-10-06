// napisati klasu televizor sa atributima... Potrebno je odraditi: konstruktor, get, set, metod pojacajTon(), metod ispisi()...

public class Televizor {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;
	
	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		super();
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaTona = jacinaTona;
	}
	
	
	public int getBrojKanala() {
		return brojKanala;
	}
	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			System.out.println("Broj kanala mora biti veci od 0.");
		}
	}
	

	public String getNazivKanala() {
		return nazivKanala;
	}
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}


	public int getJacinaTona() {
		return jacinaTona;
	}
	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			System.out.println("Jacina tona mora biti  izmedju 0 i 10.");
		}
	}
	
	public void pojacajTon() {
		if (this.jacinaTona < 10) {
			this.jacinaTona++;
		} else {
			System.out.println("Jacina tona je vec maksimalna (10).");
		}
	}
	
	public void stampa() {
		System.out.println("Broj trenutnog kanala: " + this.brojKanala);
		System.out.println("Naziv trenutnog kanala: " + this.nazivKanala);
		System.out.println("Jacina tona: " + this.jacinaTona);
	}


	public static void main(String[] args) {
		
		Televizor televizor1 = new Televizor(10, "Arena sport", 5);
		
		System.out.println(televizor1.getBrojKanala());
		televizor1.setBrojKanala(0);
		System.out.println(televizor1.getBrojKanala());
		
		televizor1.pojacajTon();
		System.out.println(televizor1.getJacinaTona());
		
		televizor1.stampa();

	}

}