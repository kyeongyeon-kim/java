import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 20, 30, 40, 50, 40 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 가장 큰 값
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		// 가장 작은 값
		// 반대로
		// 2번째로 큰 값? 3번째로 큰 값? 크기 순대로 재배열 하는 것 (정렬)
		
		
		int[] copy = Arrays.copyOf(arr, arr.length);
		int temp = copy[0];
		copy[0] = copy[1];
		copy[1] = temp;
		System.out.println(Arrays.toString(copy));
		int search = Arrays.binarySearch(copy, 30); //이진검색
		System.out.println(search);
		
//		int[] copy2 = new int[copy.length];
//		int max = 0;
//		int arrLastNum = copy2.length - 1;
//		for (int j = 0; j < copy2.length; j++) {
//			for (int i = 0; i < copy2.length; i++) {
//				if (max < copy[i]) {
//					max = copy[i];
//					System.out.println(Arrays.toString(copy));
//				}
//			}
//			copy2[arrLastNum] = max;
//		}
//		System.out.println(Arrays.toString(copy2));
			
	}
		
}
