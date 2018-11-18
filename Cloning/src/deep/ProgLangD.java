package deep;

/*the program shows DEEP CLONING
 * of an object, where fields
 * of an original object as well as
 * inner objects in fields are copied*/

public class ProgLangD implements Cloneable { // interface Cloneable
	private String lgName;
	private IDEDeepCopy ide; // this won't copy

	public ProgLangD(String name, IDEDeepCopy ide) {
		super();
		this.lgName = name;
		this.ide = ide;
	}

	public String getLgName() {
		return lgName;
	}

	public void setLgName(String name) {
		this.lgName = name;
	}

	public IDEDeepCopy getIde() {
		return ide;
	}

	public void setIde(IDEDeepCopy ide) {
		this.ide = ide;
	}

	public ProgLangD clone() throws CloneNotSupportedException {
		ProgLangD plClone = (ProgLangD) super.clone();
		plClone.ide = (IDEDeepCopy) ide.clone();
		return plClone;
	}

	@Override
	public String toString() {
		return lgName + ", IDE: " + ide;
	}
}
