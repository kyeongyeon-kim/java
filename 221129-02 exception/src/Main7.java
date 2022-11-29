import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class asdf {
	public String somemethod() {
		// 헤더는 픽스되었지만 바디가 미구현 되었을 때 활용하는 방법
		throw new UnsupportedOperationException("미구현된 메소드입니다.");
	}
}

class NoElementInArrayException extends RuntimeException {
	public NoElementInArrayException(String message) {
		super(message);
	}
}

class MySearchEngine {
	public static int indexOf(int search, int... arr) {
		if (arr == null || arr.length == 0) {
			throw new NoElementInArrayException("배열이 null참조이거나 원소가 없습니다.");
		}
		
		// 정수배열에서 정수 인덱스를 찾아 반환할 수 있는 메소드
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}
		throw new NoSuchElementException("배열의 길이는 " + arr.length + "이지만 해당하는 " + search + "값 원소를 찾지 못했습니다.");
	}
}
public class Main7 {

	public static void main(String[] args) {
		int result = MySearchEngine.indexOf(78, 1,2,3,4,5);
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		// 만들어진 클래스의 메소드를 쓸 때 Throws도 확인하여 예외적인 상황에 대응해야함
		scan.nextInt();
	}

}
