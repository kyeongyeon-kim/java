import java.util.Arrays;
import java.util.Scanner;

// 사용자에게 몇 개의 정수를 입력할 건지 물어보고
// 개수만큼 정수를 입력받아
// 합, 평균을 구하는 프로그램

// 사용자 입력 값 전부를 목록으로 출력해주세요.

public class Main8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		int arr[] = new int[count];
		
		int sum = 0;
		for (int i = 0; i < count; i++) {
			int input = scan.nextInt();
			sum += input;
			arr[i] = input;
		}
		System.out.println(sum);
		System.out.println(sum / count);
		System.out.println(Arrays.toString(arr));
	}

}
