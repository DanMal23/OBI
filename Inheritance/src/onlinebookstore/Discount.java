package onlinebookstore;

public class Discount extends Ordering {
	private int percentDiscount; // in %
	private double zlDiscount;

	public Discount(Item[] itm, String address, int percent) {
		super(itm, address);
		this.percentDiscount = percent;
		this.zlDiscount = super.getPrice() * percentDiscount / 100;
		super.setPrice(super.getPrice() - this.zlDiscount);
	}

	@Override
	public String toString() {
		return super.toString() + "The discount is " + percentDiscount + "%. You've saved " + this.zlDiscount + " PLN";
	}
}
