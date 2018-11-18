package shallow;

public class IDE {
	private String ideName;
	private double platformVersion;

	public IDE(String ideName, double platformVersion) {
		super();
		this.ideName = ideName;
		this.platformVersion = platformVersion;
	}

	public String getIdeName() {
		return ideName;
	}

	public void setIdeName(String name) {
		this.ideName = name;
	}

	public double getIdeVersion() {
		return platformVersion;
	}

	public void setIdeVersion(double pv) {
		this.platformVersion = pv;
	}

	@Override
	public String toString() {
		return ideName + ", version: " + platformVersion;
	}
}
