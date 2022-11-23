import java.util.Arrays;

public class Main9 {
	public static void main(String[] args) {
		int[] arr = {10, 30, 22, 44, 29};
		// for-each문 (자료가 담길 공간 : 여러개가 담기는 지료) // 역순 불가
		int count = 0;
		for (int elem : arr) {
			System.out.println(elem);
			arr[count] = 100;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		
		double[] dArr = {55.3, 12,34, 569, 20.11};
		for (double elem : dArr) {
			System.out.println(elem);
		}
	}

}
