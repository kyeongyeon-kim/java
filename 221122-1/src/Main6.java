import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		int[][] test = {  { 12, 33, 34 }
						, { 43, 11, 45, 333, 555, 777 } // 이런 경우 2차원배열보단 따로 사용하는게 나음
						, { 29, 34, 14 } };
		
		int[][] arr2d = new int[3][5];
//		int[][] arr2d = new int[3][]; // 두번째 대괄호를 비워놔도 가능
		arr2d[0] = new int[8];
		
		System.out.println(Arrays.deepToString(test));
		System.out.println(Arrays.toString(arr2d[0]));
	}

}
