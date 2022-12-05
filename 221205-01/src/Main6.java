import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("가");
		strList.add("나");
		strList.add("다");
		strList.add("라");
		strList.add("마");
		
		// contains : 해당 리스트에 내가 적은 객체와 같은 값이 있냐? true : false
		System.out.println(strList.contains("가"));
		System.out.println(strList.contains("바"));
		
		
		List<String> abcList = new ArrayList<String>();
		abcList.add("A");
		abcList.add("B");
		abcList.add("C");
		
		strList.addAll(abcList);
		System.out.println(strList.toString());
		
		strList.clear();
		System.out.println(strList.toString());
		System.out.println(strList.size() == 0);
		System.out.println(strList.isEmpty());
		
//		for (int i = 0; i < abcList.size(); i++) {
//			strList.add(abcList.get(i));
//		}
	}
}
