import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Collection > Set > HashSet
		Set<String> set = new HashSet<>();
		set.add("둘리");
		set.add("가나다");
		set.add("도우너");
		set.add("길동");
		set.add("둘리");
		set.add("둘리");
		set.add("둘리");
		set.add("둘리");
		set.add("둘리");
		set.add("둘리");
		// set에는 동등한 원소를 넣을 수 없다.
		// 추가가 되었는지 안되었는지 알고싶다면? => 중복된 값이 아니면 ? true : false
		System.out.println(set.add("둘리"));
		
		System.out.println(set.size());
		// List는 index를 갖고 있고 추가한 순서대로 index를 채워넣음
		// 반면 Set은 순서가 없다.
//		set.get(0);
		System.out.println(set.toString());
		
		// 원소를 어떻게 가져올 수 있나요? iterable을 활용
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// foreach활용
		for (String elem : set) {
			System.out.println(elem);
		}
		// Set == 순서가 없고 중복되지않은 집합 !
	}
}
