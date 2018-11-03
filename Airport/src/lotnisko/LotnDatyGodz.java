package lotnisko;
/**Program podaje date i godzine odlotu samolotu, 
 * czas przylotu na miejsce, date powrotu,
 * dlugosc podrozy w minutach oraz godzinach,
 * oraz odstep w dniach pomiedzy odlotem i powrotem.*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.HOURS;

public class LotnDatyGodz {

	private LocalDate dataOdlotu;
	private LocalTime godzinaOdlotu;
	private LocalDateTime czasOdlotu = null;
	private LocalTime godzinaPrzylotuNaMsce;
	private LocalDate dataPowrotu = null;

	public LotnDatyGodz(final LocalDate dodl, final LocalTime godl) {
		this.dataOdlotu = dodl;
		this.godzinaOdlotu = godl;
	}

	public LotnDatyGodz(final LocalDateTime czodl, final LocalTime gmsce, final LocalDate dpow) {
		this.czasOdlotu = czodl;
		this.godzinaPrzylotuNaMsce = gmsce;
		this.dataPowrotu = dpow;
	}

	public LotnDatyGodz(final LocalDate dodl, final LocalTime godl, final LocalDateTime czodl, final LocalTime gmsce,
			final LocalDate dpow) {
		this(dodl, godl);
		this.czasOdlotu = czodl;
		this.godzinaPrzylotuNaMsce = gmsce;
		this.dataPowrotu = dpow;
	}

	public LocalDate getDataOdlotu() {
		return dataOdlotu;
	}

	public LocalTime getGodzinaOdlotu() {
		return godzinaOdlotu;
	}

	public LocalDateTime getCzasOdlotu() {
		return czasOdlotu;
	}

	public LocalTime getGodzinaPrzylotuNaMsce() {
		return godzinaPrzylotuNaMsce;
	}

	public LocalDate getDataPowrotu() {
		return dataPowrotu;
	}

	public static void main(String[] args) {
		LocalDate odl = LocalDate.of(2018, 10, 23);
		LocalTime godl = LocalTime.of(13, 05);
		LotnDatyGodz dgodl = new LotnDatyGodz(odl, godl);
		System.out.println("Odlot samolotu dnia: " + dgodl.getDataOdlotu());
		System.out.println("Odlot o godzinie: " + dgodl.getGodzinaOdlotu());
		LocalDateTime ldt = LocalDateTime.of(2018, 10, 23, 13, 05, 00);

		LocalTime gprzylnmsce = godl.plusHours(4); // 4 godziny lotu
		LocalDate dpowr = odl.plusDays(3); // powrot za 3 dni
		LotnDatyGodz odltprzylt = new LotnDatyGodz(ldt, gprzylnmsce, dpowr);
		System.out.println("Data i godzina: " + odltprzylt.getCzasOdlotu());
		System.out.println("Godzina przylotu na miejsce: " + odltprzylt.getGodzinaPrzylotuNaMsce());
		
		System.out.println("Dlugosc podrozy w minutach: " + godl.until(gprzylnmsce, MINUTES));
		System.out.println("Dlugosc podrozy w godzinach: " + godl.until(gprzylnmsce, HOURS));
		
		System.out.println("Data powrotu: " + odltprzylt.getDataPowrotu());
		
		Period days = Period.between(odl, dpowr);
		System.out.println("Odstep czasowy odlotu i powrotu: " + days.getDays() + "dni");
	}

}
