// 책
// 제목
// 작가
// 출판사
// 장르
// 가격

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String genre;
	private int price;
	
	public Book(String title, String author, String publisher, String genre, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", genre=" + genre
				+ ", price=" + price + "]";
	}
	
	
}
