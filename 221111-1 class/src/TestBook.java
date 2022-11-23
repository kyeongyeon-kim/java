
public class TestBook {

	public static void main(String[] args) {
		Book java = new Book("파워자바", "천인국", 35000);
		
		Book b = new Book();
		System.out.println(b.getName());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());
	}

}
