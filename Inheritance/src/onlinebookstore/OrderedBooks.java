package onlinebookstore;

public class OrderedBooks extends Item{
	private Book[] books;

	public OrderedBooks(Book[] books) {
		super(0, 0);
		this.books = books;

		int time = 0;
		double price = 0;
		for (Book b : books) {
			time = b.getShippingTime();
			price += b.getUnitPrice();
		}
		super.setShippingTime(time);
		super.setUnitPrice(price);
	}

	@Override
	public String toString() {
		String s = "Ordered items: \n";
		int i = 1;
		for (Book b : books) {
			s += "\t" + (i++) + ". " + b.toString() + "\n";
		}
		s += "    this order:     \t";
		return s + super.toString();
	}
}
