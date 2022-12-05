import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("가");
		strList.add("나");
		strList.add("다");
		strList.add("라");
		strList.add("마");
		
		System.out.println("현재 size : " + strList.size());
		for (int i = 0; i < strList.size(); i++) {
			System.out.println("원소 index " + i + ", 값 : " + strList.get(i));
			
		}
		
		strList.remove(2);
		
		System.out.println("삭제 후 size : " + strList.size());
		for (int i = 0; i < strList.size(); i++) {
			System.out.println("원소 index " + i + ", 값 : " + strList.get(i));
			
		}
	}
}
