package shallow;

/*the program shows SHALLOW CLONING
* of an object, where only fields
* of an original object are copied*/

public class ProgrammingLanguage implements Cloneable { // interface Cloneable
	private String name;
	private IDE ide; // this will not copy

	public ProgrammingLanguage(String pglgname, IDE ide) {
		super();
		this.name = pglgname;
		this.ide = ide;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IDE getIde() {
		return ide;
	}

	public void setIde(IDE ide) {
		this.ide = ide;
	}

	public ProgrammingLanguage clone() throws CloneNotSupportedException {
		return (ProgrammingLanguage) super.clone();
	}

	@Override
	public String toString() {
		return name + ", IDE: " + ide;
	}
}
