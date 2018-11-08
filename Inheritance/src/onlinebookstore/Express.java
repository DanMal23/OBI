package onlinebookstore;

public class Express extends Ordering {
	private double extraCharge; // in zlotys

	public Express(Item[] itm, String address, int extra) {
		super(itm, address);
		this.extraCharge = extra;
		super.setPrice(super.getPrice() + extra);
	}

	@Override
	public String toString() {
		return super.toString() + "Includes extra charge for express shipment: " + extraCharge + " PLN";
	}
}
