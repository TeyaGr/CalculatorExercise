 package library;

public class Author extends Person{

	private String genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Author(String genre) {
		super();
		this.genre = genre;
	}

	public Author() {
		super();
	}

	@Override
	public String toString() {
		return "Author [genre=" + genre + ", name=" + name + ", lastName=" + lastName + ", embg=" + embg + "]";
	}
	
}
