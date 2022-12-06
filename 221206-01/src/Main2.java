import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("가");
		set1.add("나");
		set1.add("다");
		
		Set<String> set2 = new HashSet<>();
		set2.add("다");
		set2.add("라");
		set2.add("마");
		
		Set<String> union = new HashSet<>();
		union.addAll(set1);
		union.addAll(set2);
		
		// 중복을 제거하고, 보유한 하나씩의 원소를 보유한 합집합
		System.out.println(union);
		System.out.println(union.contains("가"));
		
		// 교집합
		Set<String> duplicate = new HashSet<>();
		duplicate.addAll(set1);
		// retainAll() = 겹치는 부분 빼고 다 제거
		duplicate.retainAll(set2);
		System.out.println(duplicate);
		
		// 차집합
		Set<String> leftOuter = new HashSet<>();
		leftOuter.addAll(set1);
		leftOuter.remove(set2);
		System.out.println(leftOuter);
		
		Set<String> same = new HashSet<>(Arrays.asList("라", "라", "가", "나", "다", "마"));
		System.out.println("same의 원소들 :" + same);
		System.out.println(union.equals(same));
	}
}
