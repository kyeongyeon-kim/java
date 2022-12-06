import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main5 {
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<>();
		set.add(new Book("책1", 3000));
		set.add(new Book("책2", 4000));
		set.add(new Book("책2", 4000));
		set.add(new Book("책3", 2000));
		
		// comparable 정의를 해줘야함
		System.out.println(set);
		// 가나다로 정렬가능
		Comparator<Book> comparator = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// 문자열끼리 비교하는 메소드 comareTo
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};
		Set<Book> set2 = new TreeSet<>(comparator);
		set2.add(new Book("책1", 3000));
		set2.add(new Book("책2", 4000));
		set2.add(new Book("책2", 4000));
		set2.add(new Book("책3", 2000));
		
		System.out.println(set2);
		
		System.out.println(set.equals(set2));
		
		// <정리>
 		// List : index활용 및 중복허용
		// ArrayList : 일반적인 상황에서 사용
		// LinkedList : 자료의 추가 삭제가 많이 일어날 때 활용
		// HashSet : 중복 활용 (순서가 없음)
		// LinkedHashSet : 추가한 순서대로 기억해주는 용도
		// TreeSet : 자료의 정렬이 필요할 때 활용
		// 어떨 때 어느 자료형을 사용하는 것이 효율적인가에 대한 공부
		 
	}
}
