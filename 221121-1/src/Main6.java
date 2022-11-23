import java.util.Arrays;

public class Main6 {
	public static int[] plusArr(int[] left, int[] right) {
		int length = left.length + right.length;
		int [] sum = new int[length];
		int j = 0;
		for (int i = 0; i < left.length; i++) {
			sum[i] += left[i];
		}
		for (int i = right.length; i < length; i++) {
			sum[i] += right[j];
			j++;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] left = { 10, 20, 30 };
		int[] right = { 40, 50 , 60 };
		
		// 결과 : 새 정수 배열 { 10, 20, 30, 40, 50, 60 }
		int[] plusArr = plusArr(left, right);
		System.out.println(Arrays.toString(plusArr));
	}

}
