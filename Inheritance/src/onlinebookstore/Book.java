package onlinebookstore;

public class Book extends Item {
	private String title;
	private String author;
	private int year;
	private int numPages;

	public Book(String title, String author, int year, int pages) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.numPages = pages;
	}

	public Book(String title, String author, int year, int pages, int shippingTime, double unitPrice) {
		super(shippingTime, unitPrice);
		this.title = title;
		this.author = author;
		this.year = year;
		this.numPages = pages;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return numPages;
	}

	@Override
	public String toString() {
		return "Book details: \nTitle: " + title + "\nAuthor: " + author + "\nYear of publication: " + year
				+ "\nNumeber of pages: " + numPages + "\n" + super.toString();
	}
}
