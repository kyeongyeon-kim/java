import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		// 여러개의 문자열 자료
		// 순서가 있는 index번호로 관리
		// 크기가 동적으로 알아서 변화
		
		List<String> strList = new ArrayList<String>();
		strList.add("둘리");
		strList.add("바나나");
		strList.add("대한민국");
		strList.add("손흥민");
		
		// 이터레이블의 이터레이터 :손을 집어넣어서 있으면 가져와 반복
		Iterator<String> iterator = strList.iterator();
		// <중요> 있냐고 물어보는 메소드 (hasNext, next) 한 쌍 
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

		
//		for (int i = 0; i < strList.size(); i++) {
//			System.out.println(strList.get(i));
//		}
		// 낯선 문법 자주 사용하기
//		for (String elem :strList) {
//			System.out.println(elem);
//		}
	}
}
