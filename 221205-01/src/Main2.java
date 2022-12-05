import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		// 제네릭 :이 리스트는 인티져를 넣어서 사용하는 List다.
		// 꺽새 안 기본형의 객체형을 적어주면 된다.
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(100);
		numberList.add(150);
		numberList.add(90);
		numberList.add(120);
//		numberList.add("asdaf"); // 불가능
		
		
		// 제네릭을 활용하여 다운캐스팅 없이 사용이 가능함 / 꺼낼 때에도 정수형태로만 꺼냄
		for (int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}
		
		int sum = 0;
		for (int i = 0; i < numberList.size(); i++) {
			// 문법적인 오류
			// 리스트 안 원소들은 object형을 띄고 있음 그렇기에 합연산이 말이 안됨
			// 불편한 방법
//			Object o = numberList.get(i);
//			Integer down = (Integer) o;
//			sum += down;
		}
		System.out.println(sum);
	}
}
