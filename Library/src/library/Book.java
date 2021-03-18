package library;

public class Book {

	
	private String title;
	private int price;
	private Author author;
	
	private boolean available;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Book(String title, int price, Author author, boolean available) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.available = available;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + author + ", available=" + available + "]";
	}
	
	
}
