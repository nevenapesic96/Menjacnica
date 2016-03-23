package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.menjacnicaInterfejs;

public class Aparat implements menjacnicaInterfejs{

	
	public void dodajKurs(GregorianCalendar datum, Kurs kurs, Valuta valuta) {
			for (int i = 0; i < valuta.getKursevi().size(); i++) {
				if(valuta.getKursevi().get(i).getDatum().equals(datum))
					valuta.getKursevi().remove(kurs);
			}
			valuta.getKursevi().add(kurs);
	}

	@Override
	public void izbrisiKurs(GregorianCalendar datum, Kurs kurs, Valuta valuta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {
		// TODO Auto-generated method stub
		return null;
	}

}
