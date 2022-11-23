import java.util.Scanner;

// 일 매출 프로그램

// 피자가게의 매출을 관리한다.
// 판매하는 피자 목록
// 페퍼로니 15000
// 치즈 14000
// 불고기 16500

// 어떤 피자를 몇 개를 팔았는지를 입력받아
// 최종적으로 총 매출이 얼마인지를 출력하는 프로그램
public class DailySales2 {
	private int pepperoni;
	private int cheese;
	private int bulgogi;
	private boolean onOff = true;
	
	public void todaySales () {
		while (onOff) {
		choosePizza();
		int pizzaNum = inputPizzaNum();
		checkPizzaSales(pizzaNum);
		System.out.println("매출" + salesSum() + "원");
		}
	}
	
	private void choosePizza() {
		System.out.println("무슨 피자를 파셨습니까? 1.페퍼로니  2.치즈  3.불고기 (4번은 프로그램 종료입니다.)");
	}
	private int inputPizzaNum() {
		Scanner scan = new Scanner(System.in);
		int pizzaNum = scan.nextInt();
		return pizzaNum;
	}
	private void checkPizzaSales (int pizzaNum) {
		switch (pizzaNum) {
		case 1:
			System.out.println("페퍼로니");
			pepperoni += 15000;
			break;
		case 2:
			System.out.println("치즈");
			cheese += 14000;
			break;
		case 3:
			System.out.println("불고기");
			bulgogi += 16500;
			break;
		case 4:
			System.out.println("프로그램 종료");
			onOff = false;
			break;
		default:
			System.out.println("올바른 번호를 입력하세요.");
		}
	}
	private int salesSum () {
		return pepperoni + cheese + bulgogi;
	}
}
