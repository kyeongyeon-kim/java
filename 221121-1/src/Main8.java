import java.util.Arrays;

public class Main8 {
	public static void main(String[] args) {
		// Main7 내용의 구현된 메소드
		// 참조를 우선으로 비교 (참조가 같으면 같은 배열이기에)
		boolean result = Arrays.equals(new int[] { 10, 20, 30 }, new int[] { 10, 20, 30 });
		System.out.println(result);
		
		int[] copy = Arrays.copyOf(new int[] { 44, 55, 66 }, 6);
		System.out.println(Arrays.toString(copy));
		
		//copyOfRange (from , to) 어디서 어디 원소까지 복사할건지
		
		int[] newArr = new int [10];
		Arrays.fill(newArr, 10);
		System.out.println(Arrays.toString(newArr));
	}

}
