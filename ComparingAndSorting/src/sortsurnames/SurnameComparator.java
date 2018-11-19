package sortsurnames;

/*The program prints sorted surnames 
 *of programming language developers
 *and year in which the language was released*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SurnameComparator implements Comparator<ProgrLanguage> {
	public int compare(ProgrLanguage p1, ProgrLanguage p2) {
		return p1.getSurname().compareTo(p2.getSurname());
	}

	public static void main(String[] args) {

		ArrayList<ProgrLanguage> plist = new ArrayList<ProgrLanguage>();
		plist.add(new ProgrLanguage("Java", "James", "Gosling", 1995));
		plist.add(new ProgrLanguage("Haskell", "Philip", "Wadler", 1990));
		plist.add(new ProgrLanguage("Turbo Pascal", "Anders", "Hejlsberg", 1986));
		plist.add(new ProgrLanguage("JS", "Brendan", "Eich", 1995));
		ArrayList<ProgrLanguage> list2 = new ArrayList<ProgrLanguage>(4);
		list2.add(new ProgrLanguage("Go", "Ken", "Thompson", 2009));
		list2.add(new ProgrLanguage("Rust", "Graydon", "Hoare", 2010));
		list2.add(new ProgrLanguage("ML", "Robin", "Milner", 1973));
		list2.add(new ProgrLanguage("Lisp", "John", "McCarthy", 1958));
		list2.add(new ProgrLanguage("Swift", "Chris", "Lattner", 2014));

		plist.addAll(list2); // merging 2 lists
		Collections.sort(plist);
		System.out.println("\tAdded lists with unsorted data:");

		for (ProgrLanguage p : plist) {
			System.out.println(p.getProgram() + ": " + p.getDevelopersName() + " " + p.getSurname() + ", " + p.getYear());
		}
		SurnameComparator sc = new SurnameComparator();

		System.out.println("\tAlphabetically sorted surnames followed by\n\t"
				+ "programming language name and year of release: ");
		Collections.sort(plist, sc);
		int index = 1;
		for (ProgrLanguage l : plist) {
			System.out.println(l.add(index++) + ". " + l.getSurname() + ", " + l.getProgram() + ":" + " " + l.getYear());
		}
	}
}
