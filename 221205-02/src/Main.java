import java.util.ArrayList;
import java.util.List;

public class Main {
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
		
//		System.out.println(list.get(2));
		
		list.add(0, new Person("마이콜", 23, 185, 70));
		list.remove(list.size() - 1);
		
		// 3번째 있는 사람 키
		Person getP= list.get(3);
		System.out.println("3번째 인덱스 사람의 키 : " + getP.getHeight());
		System.out.println(list.get(3).getHeight());
		
		// 3번째 있는 사람 키 변경
		getP.setHeight(175);
		System.out.println("3번째 인덱스 사람의 키 : " + getP.getHeight());
		
//		for (Person p : list) {
//			System.out.println(p);
//		}
	}
}
