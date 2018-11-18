package sortyears;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProgrammingLanguage implements Comparator<ProgrammingLanguage> {
	private String programmingLanguage;
	private String developer;
	private int year;

	public ProgrammingLanguage(String pl, String d, int y) {
		this.programmingLanguage = pl;
		this.developer = d;
		this.year = y;
	}

	public String getPrLg() {
		return programmingLanguage;
	}

	public String getDevpr() {
		return developer;
	}

	public int getYear() {
		return year;
	}

	public int add(int i) {
		return i++;
	}

	public static void main(String[] args) {
		ArrayList<ProgrammingLanguage> pglist = new ArrayList<ProgrammingLanguage>();
		pglist.add(new ProgrammingLanguage("Java", "Gosling", 1995));
		pglist.add(new ProgrammingLanguage("Haskell", "Wadler", 1990));
		pglist.add(new ProgrammingLanguage("Turbo Pascal", "Hejlsberg", 1986));
		pglist.add(new ProgrammingLanguage("JS", "Eich", 1995));
		pglist.add(new ProgrammingLanguage("Go", "Thompson", 2009));
		pglist.add(new ProgrammingLanguage("Rust", "Hoare", 2010));
		pglist.add(new ProgrammingLanguage("ML", "Milner", 1973));
		pglist.add(new ProgrammingLanguage("Lisp", "McCarthy", 1958));

		SortYears sy = new SortYears();
		Collections.sort(pglist, sy);
		System.out.println("Sorted data:");
		int index = 1;
		for (ProgrammingLanguage p : pglist) {
			System.out.println(p.add(index++) + ". " + p.getYear() + ", " + p.getPrLg() + ", by " + p.getDevpr());
		}
	}

	@Override
	public int compare(ProgrammingLanguage y1, ProgrammingLanguage y2) {
		if (y1.getYear() < y2.getYear())
			return -1;
		if (y1.getYear() > y2.getYear())
			return 1;
		else
			return 0;
	}

}
