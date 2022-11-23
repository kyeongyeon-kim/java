import java.util.Scanner;

//사용자에게 5개의 정수를 입력받아
// 최근 입력한 순으로(역순)으로 출력하기

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
		
		
		int[] box = new int[5];
		
		for(int i = 0; i < box.length; i++) {
			box [i] = scan.nextInt();
		}
		for(int i = box.length - 1; i >= 0; i--) {
			System.out.println(box[i]);
		}
	}
}
