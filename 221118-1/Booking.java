/*
 *  1. 배열을 활용해 간단한 좌석 예약 프로그램 만들기
 *   - 10개의 좌석이 구비되어 있음.
 *   - 사용자에게 현재 좌석 예약 상태를 보여주고
 *   예) 1 2 3 4 5 6 7 8 9 10
 *   	 o x x o x x x o x o
 *   - 몇 번째의 좌석을 예약할지를 입력 받아
 *    5
 *   예) 1 2 3 4 5 6 7 8 9 10
 *      o x x o o x x o x o
 *      
*/
import java.util.Arrays;
import java.util.Scanner;

public class Booking {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char arrChar[] = new char [10];
		for (int i = 0; i < 10; i++) {
			arrChar[i] = 'X';
		}
		
		while(true) {
			
			System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
			System.out.println(Arrays.toString(arrChar));
			
			System.out.println("예약할 좌석번호를 입력해주세요.");
			System.out.println("음수를 입력하면 프로그램이 종료됩니다.");
			
			int userInput = scan.nextInt();
			if (userInput <= 0) {
				break;
			}
			// userInput - 1 == 사용자가 보는 좌석번호 값
			if (userInput > 0 && userInput <= 10) {
				if (arrChar[userInput-1] == 'O') {
					System.out.println("이미 예약된 좌석입니다.");
				} else if (arrChar[userInput-1] == 'X') {
					System.out.println(userInput + "번 좌석이 예약되었습니다.");
					arrChar[userInput-1] = 'O';
				}
			} else {
				System.out.println("올바른 값을 입력해주세요.");
			}
		}
	}
}
