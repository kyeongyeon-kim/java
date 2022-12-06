import java.util.LinkedHashSet;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		// hashset을 상속하는 LinkedHashSet
		// 추가한 순서를 기억하는 것이 특징
		Set<String> set = new LinkedHashSet<>();
		
		set.add("가");
		set.add("가");
		set.add("가");
		set.add("가");
		set.add("나");
		set.add("나");
		set.add("나");
		set.add("다");
		set.add("라");
		
		System.out.println(set);
		// 추가한 순서만 기억하지 인덱스는 갖고 있지 않음
//		set.get(0);
	}
}
