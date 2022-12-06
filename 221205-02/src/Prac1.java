import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prac1 {
	public static void main(String[] args) {
		// 정수 2배수를 5개의 원소로 가지는 리스트 생성해보기
		List<Integer> list1 = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list1.add(i * 2);
		}
//		System.out.println(list);
//		list.clear();
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
//		for (int i = 1; i < 6; i++) {
//			list.add(i * 3);
//		}
//		System.out.println(list2);
		// 위 2개의 리스트의 모든 원소를 가지는 리스트 생성하기
		List<Integer> listAll = new ArrayList<>();
		listAll.addAll(list1);
		listAll.addAll(list2);
		// listAll의 모든 원소 콘솔 출력 확인 후, 합계 출력하기
		System.out.println(listAll);
		int sum = 0;
		for (int elem : listAll) {
			sum += elem;
		}
		System.out.println("합 : " + sum);
		
		// 위의 리스트 중 값 12가 있는지?
		if(listAll.contains(12)) {
			int index = listAll.indexOf(12);
			System.out.println("12의 인덱스 : " + index);
		}
		// 6의 개수 ?
		int count = 0;
		for (int i = 0; i < listAll.size(); i++) {
			if (listAll.get(i) == 6) {
				count++;
			}
		}
		System.out.println(count + "개");
		
		// 중복되는 원소 6 하나를 제거
		// 인덱스번호도 가능하고, 객체도 가능하기에 주의
		listAll.remove(listAll.indexOf(6));
//		listAll.remove(listAll.lastIndexOf(6));
		System.out.println(listAll);
		
		// 오름차순 정렬
		Collections.sort(listAll);
		System.out.println(listAll);
	}
}
