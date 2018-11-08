package onlinebookstore;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book("Data Structures in Java.", " Simon Gray ", 2006, 688, 3, 450);
		Book b2 = new Book("Thinking in Java.", "Bruce Eckel", 2006, 1150, 3, 150.00);
		Book b3 = new Book("Effective Java.", "Joshua Bloch", 2008, 346, 3, 99.00);
		Book b4 = new Book("Core Java vol.1", "Cay S. Horstmann", 2016, 1040, 4, 120.00);

		OrderedBooks ob1 = new OrderedBooks(new Book[] { b1, b2, b3 });
		OrderedBooks ob2 = new OrderedBooks(new Book[] { b1, b4, });

		Item[] im1 = new Item[] { ob1 };
		Ordering ord1 = new Ordering(im1, "Herbowa 4");
		Ordering ord2 = new Discount(im1, "Herbowa 4", 20);
		Ordering ord3 = new Express(im1, "Herbowa 4", 10);

		//System.out.println(ord1);
		System.out.println(ord2);
		System.out.println(ord3);

		Item[] im2 = new Item[] { ob1, b2, b3, ob2 };
		Ordering ord4 = new Ordering(im2, "Szeroka 1");
		Ordering ord5 = new Discount(im2, "Szeroka 1", 10);
		Ordering ord6 = new Express(im2, "Szeroka 1", 15);

		//System.out.println(ord4);
		System.out.println(ord5);
		System.out.println(ord6);
	}

}
