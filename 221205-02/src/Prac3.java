import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prac3 {
	public static boolean isNumberChar(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean isNumberFormat2(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!isNumberChar(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNUmberFormat(String value) {
				try {
			Integer.valueOf(value);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("문자열이 정수형태가 아니라 예외가 발생했지만, 정상흐름으로 돌아가게 예외처리함");
			return false;
		}
	}
	public static void main(String[] args) {
		List<String> datas = new ArrayList<>(Arrays.asList(
				"가", "1", "@", "3", "나", "A", "10"));
		
		List<Integer> answer = new ArrayList<>(Arrays.asList(1, 3, 10));
		List<Integer> numberData = new ArrayList<>();
		
		for (String d : datas) {
			if (isNumberFormat2(d)) {
				numberData.add(Integer.parseInt(d));
			}
		}
		System.out.println(numberData.equals(answer));
		
		// 정수형태를 가지는 문자열을 찾아
		// 정수로 변환하여 정수 리스트 생성하기
//		String a = "a";
//		char ch = a.charAt(0);
//		System.out.println(ch);
//		if (ch >= '0' && ch <= '9') {
//			System.out.println("숫자");
//		} else {
//			System.out.println("문자");
//		}
	}
}
