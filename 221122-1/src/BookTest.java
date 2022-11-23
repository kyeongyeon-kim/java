import java.util.Arrays;

// 1. 이방인 / 알베르 카뮈 / 민음사 / 소설/ 9,000원
// 2. 실천이성비판 / 임마누엘 칸트 / 아카넷/ 철학서 / 22,500 원
// 3. 군주론 / 마키아벨리 / 까치 / 철학서 / 9,000 원
// 4. 차라투스트라는* 이렇게 말했다 / 프레드리히 니체 / 사색의 숲 / 철학서 / 21,600 원
// 5. 노인과 바다/ 어니스트 헤밍웨이 / 민음사 / 소설 / 7,200 원

public class BookTest {
	public static boolean contains(String[] arr, String target) {
		for (int i = 0; i < arr.length; i++) {
			String elem = arr[i];
			if (elem != null && elem.equals(target)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// 각 책들을 인스턴스화 하기
		Book b1 = new Book("이방인", "알베르 카뮈", "민음사", "소설", 9000);
		Book b2 = new Book("실천이성비판", "임마누엘 칸트", "아카넷", "철학서", 22500);
		Book b3 = new Book("군주론","마키아벨리", "철학서", "철학서", 9000);
		Book b4 = new Book("차라투스트라는 이렇게 말했다", "프레드리히 니체", "사색의 숲", "철학서", 21600);
		Book b5 = new Book("노인과 바다", "어니스트 헤밍웨이", "민음사", "소설", 7200);
		
		// 각 책을 참조하는 길이값 5의 책 배열 만들기
		Book[] books = new Book[5];
		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		books[3] = b4;
		books[4] = b5;
//		System.out.println(Arrays.toString(books));
		
		// (출판사)민음사의 책들의 가격을 +1000 설정하기
		for (int i = 0; i < books.length; i++) {
			Book b = books[i];
			if (b.getPublisher().equals("민음사")) {
				int price = b.getPrice();
				price += 1000;
				b.setPrice(price);
			}
		}
		for (Book b : books) {
			System.out.println(b.toString());
		}
		
		// 가격 총합
		int sum = 0;
		for (int i = 0; i < books.length; i++) {
			sum += books[i].getPrice();
		}
		System.out.println(sum);
		for (Book b : books) {
			sum += b.getPrice();
		}
		System.out.println(sum);
		// 가장 비싼 가격의 책의 제목
		int max = 0;
		for (int i = 0; i < books.length; i++) {
			if (max < books[i].getPrice()) {
				max = books[i].getPrice();
			}
		}
		for (int i = 0; i < books.length; i++) {
			if (max == books[i].getPrice()) {
				System.out.println(books[i].getTitle());
			}
		}
		Book maxBook = books[0];
		for (int i = 0; i < books.length; i++) {
			if (maxBook.getPrice() < books[i].getPrice()) {
				maxBook = books[i];
			}
		}
		System.out.println(maxBook.getTitle());
		// 장르가 몇 개인지 개수 세기
		int postion = 0;
		String[] arr = new String[5];
		for (int i = 0; i < arr.length; i++) {
			String genre = books[i].getGenre();
			if (!contains(arr, genre)) {
				arr[postion] = genre;
				postion++;
			}
		}
		
		System.out.println("모든 장르 : " + Arrays.toString(arr));
		
	}
}
