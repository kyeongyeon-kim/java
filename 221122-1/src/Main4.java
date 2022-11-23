public class Main4 {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[][] test = {  { 12, 33, 34 }
						, { 43, 11, 45 }
						, { 29, 34, 14 } };
		
		// 위의 2차원 배열의 각 행의 합을 구해서 출력해보세요.
		
		
//		for	(int j = 0; j < test.length; j++) {
//			int sum = 0;
//			for (int i = 0; i < test[j].length; i++) {
//				sum += test[j][i];
//			}
//			System.out.println(sum);
//		}
		for (int j = 0; j < test.length; j++) {
			int sum = sum(test[j]);
			System.out.println(sum);
		}
		
	}

}
