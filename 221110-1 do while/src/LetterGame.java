import java.util.Random;
import java.util.Scanner;

public class LetterGame {

	public static void main(String[] args) {
		Random random = new Random();
		final int ANSWER = random.nextInt(100) + 1;
		
		Scanner scan = new Scanner(System.in);
		int guess;
		int tries = 0;
		
		do {
			System.out.println("정답을 추측하여 보시오 :");
			guess = scan.nextInt();
			tries++;
			
			if (guess > ANSWER) {
				System.out.println
							("제시한 정수가 높습니다.");
			}
			if (guess < ANSWER) {
				System.out.println
							("제시한 정수가 낮습니다.");
			}
		} while (guess != ANSWER);
		System.out.printf("축하합니다. 시도횟수 = %d\n"
											, tries);
			
	}
}// 선택값을 절반씩 나눠서 찾아나가는 방법 = 이진검색

