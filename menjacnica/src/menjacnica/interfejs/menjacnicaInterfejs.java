package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface menjacnicaInterfejs {
	public void dodajKurs(Kurs kurs, Valuta valuta);
	public void izbrisiKurs(GregorianCalendar datum, Valuta valuta);
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta);
}
