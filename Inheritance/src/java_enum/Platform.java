package java_enum;
/* The package contains codes which
 * in the Test class display information
 * on Java versions history.
 * Data is taken from 
 * https://en.wikipedia.org/wiki/Java_version_history **/

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
