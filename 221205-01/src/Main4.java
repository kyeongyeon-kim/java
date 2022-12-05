import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("둘리");
		strList.add("바나나");
		strList.add("대한민국");
		strList.add("손흥민");
		
		// 변경 방법 setter
		strList.set(0, "도우너");
		strList.set(1, "사과");
		
		// List의 특징 : 원하는 원소 삭제 -> 길이가 자동으로 조절 됨 -> 오른쪽 원소가 자동으로 2번 인덱스를 채우게 됨
		strList.remove(2);
		
		System.out.println(strList.get(2));
		
		for (String elem : strList) {
			System.out.println(elem);
		}
		
	}
}
