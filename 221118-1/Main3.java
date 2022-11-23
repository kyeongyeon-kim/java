
public class Main3 {
	public static void main(String[] args) {
		// 실수형 배열 선언 초기화(각 원소의 값은 1.02, 0.03, 4.0)
//		double[] box = new double[3];
//		box[0] = 1.02;
//		box[1] = 0.03;
//		box[2] = 4.0;
		
//		double[] box = new double[] {1.02, 0.03, 4.0};
		double[] box = {1.02, 0.03, 4.0};
		
		// 위 배열의 모든 원소값 역순으로 출력하기
		for (int i = box.length - 1; i >= 0; i--) {
			System.out.println(box[i]);
		}
	}

}
