package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.menjacnicaInterfejs;

public class Aparat implements menjacnicaInterfejs{

	public void dodajKurs(Kurs kurs, Valuta valuta) {
		boolean postoji=false;
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(kurs.getDatum()))
				postoji=true;
		}
		if(postoji)
			System.out.println("Kurs za ovaj datum vec postoji! ");
		else
			valuta.getKursevi().add(kurs);
	}

	
	public void izbrisiKurs(GregorianCalendar datum, Valuta valuta) {
		boolean postoji=false;
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(datum)){
				postoji=true;
				valuta.getKursevi().remove(valuta.getKursevi().get(i));
			}
		}
		if(!postoji)
			System.out.println("Kurs za ovaj datum ne postoji! ");
		
	}

	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum().equals(datum))
				return valuta.getKursevi().get(i);
		}
		System.out.println("Kurs za ovaj datum ne postoji! ");
		return null;
	}

}
