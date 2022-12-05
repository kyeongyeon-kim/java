import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main9 {
	public static void main(String[] args) {
		// 리스트 정렬
		List<Integer> list = new ArrayList<>(Arrays.asList(50, 30, 10, 60, 20, 40));
		Collections.sort(list);
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		});
		
		// 이진검색 방법
		int find = Collections.binarySearch(list, 30);
		System.out.println(find);
		
		// 최대값, 최소값
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		// 역순메소드, 무작위셔플메소드
		Collections.reverse(list);
		Collections.shuffle(list);
		
//		Collections.fill(list, 99);
		System.out.println(list);
		// rePlaceAll : list의 10을 99로 변경
		Collections.replaceAll(list, 10, 99);
		System.out.println(list);
		// list와 같은 길이값의 list를 넣으면 복사됨
//		Collections.copy(dest, src);
		System.out.println(list);
	}
}
