import java.util.Arrays;

public class Main3 {
	public static int[] copyArr(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		return copy;
	}
	public static void main(String[] args) {
		// 다음과 같은 정수 배열과 같은 길이와 원소를 가지는 배열 만들기(복사)
		int[] arr = { 33, 44, 55 };
		
		// 복사 x 참조만 같아지는 것임.
//		int[] arr2 = arr;
		
		int[] copy = copyArr(arr);
		
		
		System.out.println(Arrays.toString(copy));
		System.out.println(copy == arr);
	}

}
