package deep;

public class DeepCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		IDEDeepCopy ide = new IDEDeepCopy("IntelliJ IDE", 2018.3);
		ProgLangD plg1 = new ProgLangD("Java", ide);
		System.out.println("original: " + plg1); // Java, IDE: IntelliJ IDE, version: 2018.3
		System.out.println("copy:     " + plg1); // Java, IDE: IntelliJ IDE, version: 2018.3
		ProgLangD plg2 = plg1.clone();

		plg2.setLgName("Python");		
		plg2.getIde().setIdeName("Sublime");
		plg2.getIde().setIdeVersion(3.1);

		System.out.println("altered copy: " + plg2); // Python, IDE: Sublime, version: 3.1
		System.out.println("original:     " + plg1); // Java, IDE: IntelliJ IDE, version: 2018.3
		// all fields remain independent from the copy
	}
}

