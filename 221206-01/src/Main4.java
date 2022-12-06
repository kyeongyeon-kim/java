import java.util.Objects;

public class Main4 {
	public static void main(String[] args) {
		System.out.println(Objects.hash("asd", "qwer", "zxcv"));
		System.out.println(Objects.hash("asd", "qwer", "zxcv"));
//		Set<Book> books = new HashSet<>();
//		
//		// HashSet은 hash라는 값을 먼저 비교함
//		// hash값이란 ? 동일한 입력에 대한 고유한 숫자 (특정한 정보 > 숫자로) 고유한 정체성 부여
//		books.add(new Book("책1", 3000));
//		books.add(new Book("책2", 4000));
//		books.add(new Book("책2", 4000));
//		books.add(new Book("책3", 2000));
//		
//		System.out.println(books);
	}
}
