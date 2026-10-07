// Zadatak za kompleksni broj sa predavanja

public class KompleksniBroj {
	
	private double realniDio;
	private double imaginarniDio;
	
	// Default Konstruktor
	
	public KompleksniBroj() {
		realniDio = 0;
		imaginarniDio = 0;
	}
	
	// Konstruktori
	
	public KompleksniBroj(double a) {
		postaviRealniDio(a);
		postaviImaginarniDio(0);
		imaginarniDio = 0;
	}
	
	public KompleksniBroj(double a, double b) {
		realniDio = a;
		imaginarniDio = b;
	}
	
	// Seteri
	public void postaviRealniDio(double a) {
		realniDio = a;
	}
	
	public void postaviImaginarniDio(double a) {
		imaginarniDio = a;
	}
	
	// Geteri
	public double dajRealniDio() {
		return realniDio;
	}
	
	public double dajImaginarniDio() {
		return imaginarniDio;
	}
	
	public void stampaj() {
		
		if (imaginarniDio >= 0)
			System.out.printf("%.2f + %.2fi", realniDio, imaginarniDio);
		else
			System.out.printf("%.2f %.2fi", realniDio, imaginarniDio);
		
	}
	
	// Modulo kompl. broja
	
	public double modulo() {
		double rez;
		
		rez = Math.sqrt(realniDio * realniDio + imaginarniDio * imaginarniDio);
		
		return rez;
	}
	
	
	// Sabiranje kompl. broja
	
	public KompleksniBroj saberi(KompleksniBroj a) {
		
		KompleksniBroj rez = new KompleksniBroj();
		
		rez.postaviRealniDio(realniDio + a.realniDio);
		rez.postaviImaginarniDio(imaginarniDio + a.imaginarniDio);
		
		return rez;
		
	}
	
	
	// Oduzimanje kompl. broja
	
	public KompleksniBroj oduzmi(KompleksniBroj a) {
		
		KompleksniBroj rez = new KompleksniBroj();
		
		rez.postaviRealniDio(realniDio - a.realniDio);
		rez.postaviImaginarniDio(imaginarniDio - a.imaginarniDio);
		
		return rez;
		
	}
	
	
	// Mnozenje kompl. broja
	
	public KompleksniBroj pomnozi(KompleksniBroj a){
		
		KompleksniBroj rez = new KompleksniBroj();
		
		rez.postaviRealniDio(realniDio * a.realniDio - imaginarniDio * a.imaginarniDio);
		rez.postaviImaginarniDio(imaginarniDio * a.realniDio + realniDio* a.imaginarniDio);
		
		return rez;
		
	}

	
	// Dijeljenje kompl. broja
	
	public KompleksniBroj podijeli(KompleksniBroj a) {
		
	    double imenilac = a.realniDio * a.realniDio + a.imaginarniDio * a.imaginarniDio;

	    if (imenilac == 0) {
	        System.out.println("Dijeljenje sa nulom nije dozvoljeno.");
	        return null;
	    }

	    KompleksniBroj rez = new KompleksniBroj();
	    
	    double noviRealniDio = (realniDio * a.realniDio + imaginarniDio * a.imaginarniDio) / imenilac;
	    double noviImaginarniDio = (imaginarniDio * a.realniDio - realniDio * a.imaginarniDio) / imenilac;

	    rez.postaviRealniDio(noviRealniDio);
	    rez.postaviImaginarniDio(noviImaginarniDio);

	    return rez;
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	