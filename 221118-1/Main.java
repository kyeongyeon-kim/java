public class Main {
	public static void main(String[] args) {
		// 배열
		// 같은 데이터타입의 여러개의 공간을 하나의 이름으로 사용
		int[] arr; // 정수형 배열 선언
		arr = new int[5]; 
		// int를 5개 저장 할 수 있는 배열 인스턴스가 만들어짐
		// 길이가 5인 정수 배열 인스턴스 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// 길이 - 1 = 마지막 인덱스
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
