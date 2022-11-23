import java.util.Arrays;

public class Main4 {
	public static int[] expandArr(int[] origin, int plus) {
		int [] copy = new int[origin.length + plus];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		return copy;
	}
	
	public static void main(String[] args) {
		// 다음과 같은 인트 배열의 길이값을 증가시키고자 함.
		int[] arr = { 44, 55, 66 };
		
		int[] expand = expandArr(arr, 2);
		
		System.out.println(Arrays.toString(expand));
	}

}
