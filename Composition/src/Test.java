import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		OS os1 = new OS("Linux", 1991);
		OS os2 = new OS("Windows", 1985);
		OS os3 = new OS("LynxOS", 1986);
		OS os4 = new OS("Atari", 1979);
		OS os5 = new OS("Macintosh", 1984);
		OS os6 = new OS("macOS", 2001);
		OS os7 = new OS("Android", 2008);
		OS os8 = new OS("MS-DOS", 1981);
		List<OS> oslist = new ArrayList<OS>();
		oslist.add(os1);
		oslist.add(os2);
		oslist.add(os3);
		oslist.add(os4);
		oslist.add(os5);
		oslist.add(os6);
		oslist.add(os7);
		oslist.add(os8);
		Computer c = new Computer(oslist);
		List<OS> opss = c.getListOfOSs();
		for (OS o : opss) {
			System.out.println("OS: " + o.osName + ", year: " + o.yearRelease);

		}
	}

}
