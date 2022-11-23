
public class Main9 {		// 가변 길이 파라미터(가변인자) 주의점 ! 파라미터에서 순서가 가장 뒤에 존재해야함
	public static void printAll(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
//		int[] arr = { 10, 20, 30, 40, 50 };
//		printAll(new int[] { 10, 20, 30, 40, 50 });
		printAll(10, 20, 30, 40, 50); // 가변인자를 사용 할 때 쉼표로 구분한 정수를 인식함 파라미터에서 배열을 만들게 됨
	}				

}
