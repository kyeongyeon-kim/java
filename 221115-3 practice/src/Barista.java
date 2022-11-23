import java.util.Scanner;

public class Barista {
	Scanner scan = new Scanner(System.in);
	public void makeCoffee() {
		OderList ol = new OderList();
		ol.showList();
		System.out.println();
		ol.needForCoffee();
		System.out.println("\n음료를 완성시킨 후 1을 입력하면 고객의 진동벨이 울립니다.\n주문이 취소되었다면 0을 입력하세요.");
		int onOff = scan.nextInt();
		if(onOff == 1) {
			System.out.println("진동벨이 울린다.");
		} else if(onOff == 0) {
			System.out.println("주문이 취소되었습니다.");
		} else {
			System.out.println("올바른 값을 입력하세요.");
		}
	}
}
