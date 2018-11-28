package java_enum;

public class PlatformInfo extends Version {
	private int year;
	private String features;

	public PlatformInfo(Platform pm, double ver, String code, int y, String fs) {
		super(pm, ver, code);
		year = y;
		features = fs;
	}

	public int getYear() {
		return year;
	}

	public String getFeatures() {
		return features;
	}

	public String toString() {
		return super.toString() + ", released in " + year + "," + " \n\t addition or improvement: " + features + "\n";
	}
}