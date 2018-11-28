/**
 * The program prints the names of Java versions, the number of the version, code
 * name, years of releases and some main features that had been implemented or
 * added to the versions.
 * 
 * @author DANUTA
 *
 */
public enum Platform {
	JDK("JDK"), J2SE("J2SE"), JAVASE("JavaSE");

	private String name;

	private Platform(String s) {
		name = s;
	}

	@Override
	public String toString() {
		return name;
	}
}
