package daty;

/*Uzytkownik wpisuje na konsoli date
 * w podanym formacie;
 * Program oblicza date za rok,
 * i podaje nazwe dnia tygodnia, dzien, miesiac oraz rok*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DataZaRok {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Scanner skraner = new Scanner(System.in);
		System.out.println("Podaj date w formacie: dd.MM.yyyy  \n(np. 1.12.2018) "
				+ "\ni wcisnij Enter:");
		String string = skraner.nextLine();
		skraner.close();

		Date data = sdf.parse(string);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.YEAR, 1);
		data = calendar.getTime();

		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.forLanguageTag("pl"));
		String str = df.format(data);
		System.out.println("Za rok bedzie: " + str);
	}
}
