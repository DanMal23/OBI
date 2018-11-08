package onlinebookstore;

public class Ordering {
	private Item[] items;
	private String address;

	private double totalPrice;

	public double getPrice() {
		return totalPrice;
	}

	protected void setPrice(double tp) {
		totalPrice = tp;
	}

	public Ordering(Item[] itm, String address) {
		items = itm;
		this.address = address;
		for (Item i : items) {
			totalPrice += i.getUnitPrice();
		}
	}

	@Override
	public String toString() {
		String s = " -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --\n Ordering address: " + address + "\n";
		int j = 1;
		for (Item im : items) {
			s += (j++) + ". " + im.toString() + "\n----------------------------------\n";
		}
		s += "Total: ";
		s += totalPrice + " PLN";
		return s + "\n----------------------------------\n";
	}
}
