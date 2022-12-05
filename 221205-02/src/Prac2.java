import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Prac2 {
	public static void main(String[] args) {
		List<String> origin = new ArrayList<>(Arrays.asList(
				"apple", "banana", "carrot", "donut", "egg"));
		
		// 위의 리스트에서 문자열 중 길이가 5이하인 문자열만을 원소로 가지는 리스트 생성하기
		List<String> five = new ArrayList<>();
		for (int i = 0; i < origin.size(); i++) {
			if (origin.get(i).length() <= 5) {
				five.add(origin.get(i));
			}
		}
		System.out.println(five);
		
		// 원본 origin 리스트에서 6자 이상의 문자열을 제거하기
		// 안전하게 제거하기위해 iterator 활용
		Iterator<String> iterator = origin.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() >= 6) {
				iterator.remove();
			}
		}
		System.out.println(origin);
		
		//		for (int i = 0; i < origin.size(); i++) {
//			if (origin.get(i).length() >= 6) {
//				origin.remove(i);
//				i--;
//			}
//		}
//		System.out.println(origin);
		
		// 똑같은 리스트인지 알아보는 법
		// 순서같고 원소같고~
		System.out.println(five.equals(origin));
	}
}
