public class Main7 {
	public static boolean arryEqual(int[] left, int[] right) {
		boolean ok;
		if (left.length == right.length) {
			for (int i = 0; i < left.length; i++) {
				System.out.print(i + "번째 원소가 같은가? ");
				System.out.println(left[i] == right[i]);
			} 
			ok = true;
		} else {
			ok = false;
		}
		return ok;
		
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] arr2 = { 10, 20, 30 };
		
		//위 두 배열이 길이가 같고 원소가 같은지 확인해보세요.
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i + "번째 원소가 같은가? ");
//			System.out.println(arr[i] == arr2[i]);
//		}
		
		System.out.println(arryEqual(arr, arr2));
	}

}
