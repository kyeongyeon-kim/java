public class Main2 {
	public static void main(String[] args) {
		// 정수형 배열(길이 : 4)인 선언 초기화
		int[] myBox = new int[4];
		
		//myBox.length = 300;  길이값은 고정 ! 바꿀 수 없음
		
		// 위의 배열의 모든 인덱스에 접근해서 각 원소(element)값을 55로 초기화하기
		myBox [0] = 55;
		myBox [1] = 55;
		myBox [2] = 55;
		myBox [3] = 55;
		
		for (int i = 0; i < myBox.length; i++) {
			myBox [i] = 55;
		}
		for (int i = 0; i < myBox.length; i++) {
			System.out.println(myBox[i]);
		}
	}
}
