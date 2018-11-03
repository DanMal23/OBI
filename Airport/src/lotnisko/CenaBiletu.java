package lotnisko;

/**Program podaje informacje dotyczace
 * rezerwacji biletow, podaje cene laczna 
 * uwzgledniajac ilosc zakupionych biletow, 
 * ilosc bagazu dodatkowego, oferujac znizki
 * jezeli ilosc biletow przekroczy pewna ilosc.
 */

public class CenaBiletu {
	private int iloscBiletow = 0;
	private double cenaZaBilet;
	private double dodatkowyBagaz = 10.00;

	public CenaBiletu(int ibil, double cenab, double dod) {
		this.iloscBiletow = ibil;
		this.cenaZaBilet = cenab;
		this.dodatkowyBagaz = dod;
	}

	public CenaBiletu(int ibil) {
		this.iloscBiletow = ibil;
	}

	public void rezerwuj() {
		if (iloscBiletow >= 2 && iloscBiletow <= 4) {
			double biletZniz1 = (cenaZaBilet * 0.75 * iloscBiletow) + (dodatkowyBagaz * 10);
			System.out.println(
					"Przy zakupie od 2-4 biletow znizka 75% ceny biletu. " + "\nCena laczna: " + biletZniz1 + " PLN");
			// System.out.println("\n \t Have a nice trip :)");
		} else if (iloscBiletow >= 5 && iloscBiletow <= 10) {
			double biletZniz2 = (cenaZaBilet * 0.50 * iloscBiletow) + (dodatkowyBagaz * 10);
			System.out.println("Przy zakupie od 5-10 biletow znizka 50% ceny biletu" + " \n\n \t Cena laczna: "
					+ biletZniz2 + " PLN");
			// System.out.println("\n \tHave a nice trip :)");

		} else if (iloscBiletow == 1) {
			double cenaLacz = (iloscBiletow * cenaZaBilet + dodatkowyBagaz * 10);
			System.out.println("Cena laczna: " + cenaLacz + " PLN");
			// System.out.println("\n \t a nice trip :)");
		} else if (iloscBiletow > 10) {
			System.out.println("Ilosc rezerwowanych biletow przekroczyla 10 sztuk." + "\n\t Powtorz rezerwacje.");
		}
	}

	public int getIloscBiletow() {
		return iloscBiletow;
	}

	public void setIloscBiletow(int iloscBiletow) {
		this.iloscBiletow = iloscBiletow;
	}

	public double getCenaZaBilet() {
		return cenaZaBilet;
	}

	public void setCenaZaBilet(double cenaZaBilet) {
		this.cenaZaBilet = cenaZaBilet;
	}

	public double getDodatkowyBagaz() {
		return dodatkowyBagaz;
	}

	public void setDodatkowyBagaz(double dodatkowyBagaz) {
		this.dodatkowyBagaz = dodatkowyBagaz;
	}

	public static CenaBiletu createCenaBiletu(int ibil, double cenab, double dod) {
		CenaBiletu c = new CenaBiletu(ibil, cenab, dod);
		return c;
	}

	public static CenaBiletu printNum(int ibil) {
		CenaBiletu ilosc = new CenaBiletu(ibil);
		return ilosc;
	}

	public void addit() {
		System.out.println("\n\t Have a nice trip :)");
	}

	public static void main(String[] args) {
		CenaBiletu cena1 = CenaBiletu.createCenaBiletu(1, 150.00, 1);
		System.out.println("Zarezerwowana ilosc biletow: " + cena1.getIloscBiletow());
		System.out.println("Cena za bilet: " + cena1.getCenaZaBilet() + " PLN");
		System.out.println("Cena za bagaz dodatkowy: " + 10 * cena1.getDodatkowyBagaz() + " PLN");
		cena1.rezerwuj();
		System.out.println("---------------------------");
		CenaBiletu cena2 = new CenaBiletu(2, 150.00, 2);
		System.out.println("Zarezerwowana ilosc biletow: " + cena2.getIloscBiletow());
		cena2.getCenaZaBilet();
		cena2.rezerwuj();
		cena2.getIloscBiletow();
		cena2.addit();
	}
}
