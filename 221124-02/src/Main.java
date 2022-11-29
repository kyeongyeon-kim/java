import java.util.Arrays;
import java.util.Comparator;

// 책
// 관리번호
// 제목
// 저자
// 가격

// 모든 필드 초기화 생성자
// public getter/setter
// toString() 재정의
// equals 재정의 : ( 관리번호, 제목, 저자 ) 같을 시 같은 책

// 테스트
// 여러권의 책 인스턴스를 생성하고
// 배열로 참조 만들기.

// 배열을 정렬. (가격의 오름차순) - 필요한 인터페이스 구현.
class Book implements Comparable<Book>{
	private int serialNum;
	private String title;
	private String athor;
	private int price;
	
	
	

	@Override 
	public int compareTo(Book o) {
		return this.price - o.price;
	}
	// 양수 : 내 책이 더 비싸다. 음수 : 전달받은 책이 더 비싸다. 0 : 가격이 같다.


	public Book(int serialNum, String title, String athor, int price) {
		super();
		this.serialNum = serialNum;
		this.title = title;
		this.athor = athor;
		this.price = price;
	}


	public int getSerialNum() {
		return serialNum;
	}


	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAthor() {
		return athor;
	}


	public void setAthor(String athor) {
		this.athor = athor;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (athor == null) {
			if (other.athor != null)
				return false;
		} else if (!athor.equals(other.athor))
			return false;
		if (serialNum != other.serialNum)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [serialNum=" + serialNum + ", title=" + title + ", athor=" + athor + ", price=" + price + "]\n";
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Book[] books = new Book[] {new Book(1, "트렌드 코리아 2023", "김난도", 17_100)
								   , new Book(2, "아버지의 해방일지", "정지아", 13_500)
								   , new Book(3, "2023 맘마미아 가계부", "맘마미아", 10_050)
								   , new Book(4, "불편한 편의점 2", "김호연", 12_600)
								   , new Book(1, "역행자", "자청", 15_750)
								   , new Book(4, "불편한 편의점 2", "김호연", 15_600)
		};
		System.out.println(books[3].equals(books[5]));
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
	}
}
