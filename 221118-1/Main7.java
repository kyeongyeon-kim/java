public class Main7 {
	public static void main(String[] args) {
		// 다음과 같은 정수형 배열이 있을 때
		int[] arr = {15, 32, 222, 334, 38, 59, 9, 12345};
		
		// 1. 배열의 원소는 몇 개 입니까?
		System.out.println("총 몇 개? " + arr.length);
		
		// 2. 2자리 수의 원소는 몇 개?
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (number >= 10 && number < 100) {
				count++;
			}
		}
		System.out.println(count);
		
		// 3. 모든 원소의 합은?
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a += arr[i];
		}
		System.out.println(a);
		
		// 4. 모든 원소 평균?
		System.out.println(a / arr.length);
	}

}
