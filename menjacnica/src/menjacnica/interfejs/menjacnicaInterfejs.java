package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface menjacnicaInterfejs {
	public void dodajKurs(GregorianCalendar datum, Kurs kurs);
	public void izbrisiKurs(GregorianCalendar datum, Kurs kurs);
	public Kurs vratiKurs(GregorianCalendar datum);
}
