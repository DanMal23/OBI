package daty;

/*Uzytkownik wpisuje na konsoli date
 * w podanym formacie;
 * Program oblicza date za dwa tygidnie, za miesiac i za rok.
 * Program podaje nazwe dnia tygodnia, dzien, miesiac oraz rok*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class PrzyszleDaty {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Scanner skr = new Scanner(System.in);
		System.out.println("Podaj date w formacie: dd.MM.yyyy  \n(np. 01.01.2018) \ni wcisnij Enter: ");
		String string = skr.nextLine();
		skr.close();

		Date data1 = sdf.parse(string);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(data1);
		cal1.add(Calendar.DAY_OF_YEAR, 14);
		data1 = cal1.getTime();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, Locale.forLanguageTag("pl"));
		String str1 = df1.format(data1);
		System.out.println("> Data za 2 tygodnie: " + str1);

		Date data2 = sdf.parse(string);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(data2);
		cal2.add(Calendar.MONTH, 1);
		data2 = cal2.getTime();

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.forLanguageTag("pl"));
		String str2 = df2.format(data2);
		System.out.println("> Data za miesiac:    " + str2);

		Date data3 = sdf.parse(string);
		Calendar cal3 = Calendar.getInstance();
		cal3.setTime(data3);
		cal3.add(Calendar.YEAR, 1);
		data3 = cal3.getTime();

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, Locale.forLanguageTag("pl"));
		String str3 = df3.format(data3);
		System.out.println("> Data za rok:        " + str3);
	}
}
