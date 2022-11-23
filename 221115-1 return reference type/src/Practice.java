import java.util.Scanner;

// 캔음료 클래스
// 이름
// 가격
// 용량

// 자판기 클래스
// 캔음료 인스턴스를 생성해서 반환하는 기능(콜라 1900원 250)해서 반환하는 기능

// 기능 수정
// 파라미터 입력값에 따라
// (사이다, 1700원 250)
// (커피, 1800, 210)

public class Practice {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.콜라 2.사이다 3.커피");
		int input = scan.nextInt();
		
		
		Drink d = vm.drinkInfo(input);
		
		if (d != null) {
			System.out.println("선택한 메뉴정보");
			System.out.println(d.toString());
		} else {
			System.out.println("잘못된 입력");
		}
	}
}
