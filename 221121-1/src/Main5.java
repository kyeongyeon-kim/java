import java.util.Arrays;

public class Main5 {
public static int[] plusArr(int[] left, int[] right) {
		int length = left.length > right.length ? left.length : right.length;
		int [] sum = new int[length];
		
		for (int i = 0; i < left.length; i++) {
			
			sum[i] += left[i];
		}
		for (int i = 0; i < right.length; i++) {
					
			sum[i] += right[i];
				}
		return sum;
	}
	
	
	
//	public static int[] plusArr(int[] arr1, int[] arr2) {
//		
//		if (arr1.length >= arr2.length) {
//			int[] arr3 = new int[arr2.length];
//			for (int i = 0; i < arr2.length; i++) {
//				arr3[i] = arr1[i] + arr2[i];
//			}	
//		} else if (arr1.length <= arr2.length) {
//			int[] arr3 = new int[arr1.length];
//			for (int i = 0; i < arr1.length; i++) {
//				arr3[i] = arr1[i] + arr2[i];
//			}
//			return arr3;
//		}
//		return arr2;
//	}
	
	public static void main(String[] args) {
		// 다음 두 개의 배열의 각 인덱스별 '합'을 원소로 가지는 새 정수 배열 만들기
		
		int[] left = { 10, 20, 30 };
		int[] right = { 20, 40, 60, 70, 90 };
		
		int[] plusArr = plusArr(left, right);
		System.out.println(Arrays.toString(plusArr));
//		System.out.println(Arrays.toString(left));
//		System.out.println(Arrays.toString(right));
	}

}
