import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 예외적인 상황이 발생 (exception)
		// call stack이 출력된 상황
		// 메소드 호출의 흐름이 stack이라는 형태처럼 표현되어 있는
		// stack 맨처음 == 가장 최근에 실행된 메소드 <=> stack 맨 마지막 == 제일 처음 실행된 메소드
		// call stack 보고서라고 보면 됨
		System.out.println("정수를 입력하세요.");
		
		// 예외를 처리할 수 있는 방법 !
		// 내가 알고 있는 것이 기본적인 예외처리방법(조건문 부여)
		
		// trycatch문 : 
		// try바디에 동작하려는 예외가 발생할 수 있는 문장이 들어가고
		// catch try에서 발생한 예외적인 상황에 실행되는 바디
		
		// 예외적인 상황 : try > catch > 정상종료 (정상적인 동적흐름)
		// catch파라미터에는 예외의 타입을 적절히 사용해야함
		// Trhowable > Error, Exception
		// Error : 개발자가 손 쓸 수 없는 (대개 하드웨어적 문제)
		// Exception : 개발자가 접할 수 있는 예외 상황(다양한 타입의 예외들이 정의되어있음)
		// exception, runtimeEception 두 예외에는 문법적인 차이가 존재함
		// InputMismatchException의 부모 == RuntimeException
		// Exception의 상속구조
		
		// (모든 예외를 잡고 싶다면 Exception e 활용)?
		// 자식으로만 예외를 잡아야 하는 이유
		// 하나의 예외만 나오는게 아니라서
		// 어떤 예외처리 방법으로 처리 되었는지 알 수 없어서
		// 부모클래스 타입을 아래쪽 캐치에 넣어야함
		// 자식 > 부모 차순
		try {
			int i = scan.nextInt(); 
			System.out.println(i);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으론 나눌 수 없습니다.");
		}
		System.out.println("정상 종료");
		
		
	}

}
