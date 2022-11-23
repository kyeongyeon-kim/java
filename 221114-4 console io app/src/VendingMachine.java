// 자판기
// 1. 콜라
// 2. 사이다
// 3. 커피
import java.util.Scanner;


public class VendingMachine {
	
	public void 시작버튼() {
		메뉴가콘솔에보인다();
		int 사용자의선택 = 사용자가메뉴를선택한다();
		가격이콘솔에보인다(사용자의선택);
	}
	
	private void 메뉴가콘솔에보인다() {
		System.out.println("1.콜라 2.사이다 3.커피");
	}
	private int 사용자가메뉴를선택한다() {
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		return userInput;
	}// 리턴 방법 외에 변수를 선언해서 저장하는 방법도 있음
	
	private void 가격이콘솔에보인다(int 사용자의선택) {
		switch(사용자의선택) {
		case 1:
			System.out.println("콜라는 2000원");
			break;
		case 2:
			System.out.println("사이다는 1500원");
			break;
		case 3:
			System.out.println("커피는 1800원");
			break;
		default:
			System.out.println("없는 번호입니다.");
		}
	}
	
	public static void main(String[] args) {
		// 자판기 만들어서 시작 버튼
		VendingMachine vm = new VendingMachine();
		vm.시작버튼();
	}

}
