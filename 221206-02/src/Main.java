import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// LinkedList 추가 삭제 작업에 있어서 상대적으로 빠르다. 속도가 유의미하게 차이가 난다.
		// 추가 제거 작업이 많을 땐 LinkedList를 활용
		// 추가 제거 외 대부분의 동작에서는 ArrayList가 빠르다.
		List<String> list = new LinkedList<>();
		list.add("가");
		list.add("가");
		list.add("다");
		list.add("라");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(1);
		System.out.println("삭제 후 : " + list);
		
		list.add(0, "젤처음추가");
		System.out.println("추가 후 : " + list);
		
	}
}
