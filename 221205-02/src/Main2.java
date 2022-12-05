import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
	public static int searchByName(List<Person> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			if (p.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person("둘리", 22, 180, 80);
		Person p2 = new Person("도우너", 25, 170, 90);
		Person p3 = new Person("길동", 32, 190, 85);
		Person p4 = new Person("희동", 5, 100, 30);
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		int search = searchByName(list, "도우너");
		System.out.println(search);
		
		// 도우너라는 사람이랑 같은 사람 찾는 방법
		// Person 클래스에서 equals를 정의했기때문에  사람객체만 넣어줘도 됨 (정의하지 않았다면 false값이 나옴)
//		boolean result = list.contains("도우너");
		boolean result = list.contains(new Person("도우너", 25, 170, 90));
		System.out.println(result);
		
		int index = list.indexOf(new Person("도우너", 25, 170, 90));
		System.out.println(index);
		
		// 속성값들 비교는 equals
		// comparable은 속성값의 크기 비교
		
		// 사람의 속성은 여러개인데, 어느 속성을 기준으로 해야하는지
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getHeight() - o2.getHeight();
			}
		});
		System.out.println(list);
	}
}
