import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("원소", "들을", "여러개"));
		
		// list > 배열로 복사
//		String[] arr = new String[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			arr[i] = list.get(i);
//		}
		// list.toArray() 배열형태의 객체 아무거나 파라미터에 넣으면 됨
		String[] arr = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		// subList(첫값, 끝값) 잘라줌
		System.out.println(list.subList(1, 3));
	}
}
