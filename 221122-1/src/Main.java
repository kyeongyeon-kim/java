import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		
		
		int[][] arr2d = { arr, arr2, arr3 };// int 배열을 참조하는 배열
		
		System.out.println(arr2d[0].length);
		System.out.println(arr2d[1].length);
		System.out.println(arr2d[2].length);
		
		System.out.println(arr2d.length);
		// 3행 10열의 2차원 배열이다!
		Arrays.fill(arr, 2); // 같은말
		Arrays.fill(arr2d[0], 2); // 같은말
		System.out.println(Arrays.toString(arr2d[0]));
		
		for (int i = 0; i < arr2d[1].length; i++) {
			arr2d[1][i] = 22;
		}
		for (int i = 0; i < arr2d[1].length; i++) {
			System.out.println(arr2d[1][i]);
		}
	}

}
