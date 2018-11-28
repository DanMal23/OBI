package java_enum;

public class Test {

	public static void main(String[] args) {

		Version versions[] = new Version[12];
		versions[0] = new PlatformInfo(Platform.JDK, 1.0, "Oak", 1996,
				"JDK 1.2.0 is the first stable version called Java 1");
		versions[1] = new PlatformInfo(Platform.JDK, 1.1, "none", 1997, "Inner classes, JavaBeans, reflection");
		versions[2] = new PlatformInfo(Platform.J2SE, 1.2, "Playground", 1998,
				"Swing, Collections framework," + "1520 classes in 59 packages to date");
		versions[3] = new PlatformInfo(Platform.J2SE, 1.3, "Kestrel", 2000, "HotSpot JVM, JPDA, JNDI");
		versions[4] = new PlatformInfo(Platform.J2SE, 1.4, "Merlin", 2002, "Regular expressions, assert keyword");
		versions[5] = new PlatformInfo(Platform.J2SE, 1.5, "Tiger", 2004, "Generics, Enum, Varargs, Scanner class");
		versions[6] = new PlatformInfo(Platform.JAVASE, 1.6, "Mustang", 2006, "many GUI, JVM etc improvements");
		versions[7] = new PlatformInfo(Platform.JAVASE, 1.7, "Dolphin", 2011, "JVM support for dynamic lgs,...");
		versions[8] = new PlatformInfo(Platform.JAVASE, 1.8, "Spider", 2014, "Streams, Lambda, Date&Time Api");
		versions[9] = new PlatformInfo(Platform.JAVASE, 1.9, "none", 2017, "jshell, XML Calatogs,...");
		versions[10] = new PlatformInfo(Platform.JAVASE, 10, "none", 2018, "Garbage Collector Interface,...");
		versions[11] = new PlatformInfo(Platform.JAVASE, 11, "none", 2018, "JavaEE module removed form JDK");

		for (Version v : versions) {
			System.out.print(v.toString());
		}
	}
}
