import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		Set<Integer> setNumber = new HashSet<>();
		setNumber.add(100);
		setNumber.add(10);
		setNumber.add(100);
		setNumber.add(99);
		setNumber.add(1);
		setNumber.add(1);
		
		System.out.println(setNumber);
		
		// 1.중복되지 않는 정수(1 ~ 45사이) 6개를 원소로 가지는 집합 만들기
		// 2.집합을 오름차순으로 정렬하고 싶을 때?
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		while(lotto.size() < 6) {
			int number = random.nextInt(45) + 1;
			lotto.add(number);
		}
		System.out.println(lotto);
		
		// 생성자에서도 add를 할 수 있음
		List<Integer> list = new ArrayList<>(lotto);
//		for (Integer n : list) {
//			list.add(n);
//		}
		list.addAll(lotto);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
