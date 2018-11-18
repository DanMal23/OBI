package sortyears;

import java.util.Comparator;

public class SortYears implements Comparator<ProgrammingLanguage> {
	public int compare(ProgrammingLanguage p1, ProgrammingLanguage p2) {
		return p1.getYear() - p2.getYear();
	}

}
