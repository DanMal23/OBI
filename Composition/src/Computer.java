import java.util.List;

public class Computer {
	private final List<OS> opsys;

	public Computer(List<OS> opsys) {
		this.opsys = opsys;
	}

	public List<OS> getListOfOSs() {
		return opsys;
	}

}
