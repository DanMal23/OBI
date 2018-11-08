package onlinebookstore;

public class Item {
	private int shippingTime; // in days
	private double unitPrice; // in zlotys

	public Item() {
	}

	protected Item(int time, double price) {
		this.shippingTime = time;
		this.unitPrice = price;
	}

	public int getShippingTime() {
		return shippingTime;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	protected void setShippingTime(int shippingTime) {
		this.shippingTime = shippingTime;
	}

	protected void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Shipping time: " + shippingTime + " days;\t\t" + "Price: " + unitPrice + " PLN";
	}
}
