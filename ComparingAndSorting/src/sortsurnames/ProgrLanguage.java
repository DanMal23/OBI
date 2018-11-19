package sortsurnames;

public class ProgrLanguage implements Comparable<ProgrLanguage> {
	private String program;
	private String developersname;
	private String surname;
	private int year;

	public int compareTo(ProgrLanguage pg) {
		return this.year - pg.year;
	}

	public ProgrLanguage(String n, String dn, String sn, int y) {
		this.program = n;
		this.developersname = dn;
		this.surname = sn;
		this.year = y;
	}

	public String getProgram() {
		return program;
	}

	public String getDevelopersName() {
		return developersname;
	}

	public String getSurname() {
		return surname;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {

	}

	public int add(int i) {
		return i++;
	}
}
