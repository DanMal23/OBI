package shallow;

public class ShallowCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		IDE ide = new IDE("Eclipse", 4.9);
		ProgrammingLanguage plg1 = new ProgrammingLanguage("Java", ide);
		System.out.println("original: " + plg1); // Java, IDE: Eclipse, version: 4.9
		System.out.println("copy:     " + plg1); // Java, IDE: Eclipse, version: 4.9
		ProgrammingLanguage plg2 = plg1.clone();

		plg2.setName("Python");
		plg2.getIde().setIdeName("Atom");
		plg2.getIde().setIdeVersion(1.33);
		
		System.out.println("altered copy: " + plg2); // Python, IDE: Atom, version: 1.33
		System.out.println("original:     " + plg1); // Java, IDE: Atom, version: 1.33
		
		/* only the original field representing 
		 * the name of the programming language 
		   remains independent from the copy */
	}
}
