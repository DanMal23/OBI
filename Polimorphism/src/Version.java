
public class Version {
	private final Platform platform;
	private final double version;
	private final String codeName;

	public Version(Platform pm, double ver, String code) {
		platform = pm;
		version = ver;
		codeName = code;
	}

	public Platform getPlatform() {
		return platform;
	}

	public double getVersion() {
		return version;
	}

	public String getCodeN() {
		return codeName;
	}

	public String toString() {
		return platform + ",  " + version + ", codename: " + codeName;
	}

}
