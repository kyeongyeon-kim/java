import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		// List는 capacity 형태로 길이값을 갖고 있음
		// capacity를 설정해 줄 수 있고, capacity를 넘어가면 capacity의 배수로 길이값이 늘어남
//		List<Integer> list = new ArrayList<Integer>(10);
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 100, 2, 100, 3, 4, 5, 6));
		System.out.println(list.size());
		System.out.println(list);
		
		// index를 설정할 수 있는 add가 있다
		list.add(0, 100);
		System.out.println(list);
		
		boolean all = list.containsAll(new ArrayList<>(Arrays.asList(1, 2, 3)));
		System.out.println(all);
		// indexOf 정순 lastIndexOf 역순
		int index1 = list.lastIndexOf(100);
		int index2 = list.indexOf(100);
		System.out.println(index1);
		System.out.println(index2);
		
	}
}
