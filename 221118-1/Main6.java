import java.util.Arrays;
import java.util.Scanner;

// 사용자가 정수를 반복해 입력합니다.
// 사용자가 0이하의 정수를 입력하면 입력 종료
// 최근 5개의 정수를 출력하기 ( 출력순서는 상관없음 )

public class Main6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int [5];
		
		int i = 0;
		while (true) {
			if(scan.nextInt() <= -1) {
				for(int j = arr.length - 1; j >= 0; j--) {
					System.out.println(arr[j]);
				}
				break;
			}
			if(i <= 4) {
				arr [i] = scan.nextInt();
			} else {
				arr [i] = scan.nextInt();
				i = -1;
			}
			i++;
		}
		int index = 0;
		while (true) {
			int input = scan.nextInt();
			if (input < 0) {
				break;
			}
			arr[index] = input;
			index++;
			
			if (index == 5) {
				index = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
