import java.util.Arrays;
import java.util.StringJoiner;

public class Main4 {
	// 문자 배열을 전달받아 모든 원소를 출력하는 메소드
	public static void printAll (char[] target) {
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]);
		}
	}
	
	// 문자 배열과 특정문자 하나를 전달받아
	// 문자의 인덱스 찾아 반환하는 메소드
	
	public static int whereIs (char[] target, char c) { // 찾는 문자가 없으면 반환이 없기에 그 경우의 리턴값을 설정해줘야함.
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) {
			System.out.println(target[i]);
			return i;
			}
		}
		return -1;
	}
	
	// 문자 배열을 전달받아
	// 각 원소를 표현할 수 있는 문자열로 생성하여 반환하는 메소드

	public static String arrToStr(char[] target) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int i = 0; i < target.length; i++) {
			sj.add("" + target[i]);
		}
		return sj.toString();
	}
	
	public static void main(String[] args) {
		// 문자(char) 배열. 각 원소의 값은 'h' 'e' 'l' 'l' 'o'
		char[] hello = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(Arrays.toString(hello));
		
		
		printAll(hello);
		System.out.println();
		System.out.println(whereIs(hello,'o'));
		System.out.println(whereIs(hello,'a'));
		System.out.println(arrToStr(hello));
		// 모든 원소 출력
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
		
		// 위의 문자 배열에서 'o' 문자의 인덱스를 "찾아" 출력하기
//		for (int i = 0; i < hello.length; i++) {
//			if (hello[i] == 'o') {
//				System.out.println("찾았다. o의 인덱스 : " + i);
//			}
//		}
	}
}
