
public class Main5 {
	public static void 예외가발생할수있는메소드() {
		System.out.println("메소드 호출");
		
		boolean 예외적상황 = true;
		if (예외적상황) {
			throw new My런타임예외상속("메소드 도중 예외적 상황으로 예외 발생");
		}
		
		System.out.println("메소드 반환");
	}
	public static void main(String[] args) {
		// 예외 만들기
		System.out.println("프로그램 시작");
		
		
		
		// throw 예외발생 키워드
//		boolean go = true;
//		if (go) {
//			throw new My런타임예외상속("런타임 예외 생성해보기");
//		}
//		System.out.println("프로그램 종료");
//		
		// 예외 처리해보기
		try {
			예외가발생할수있는메소드();
			throw new My런타임예외상속("런타임 예외 생성해보기");
		} catch (My런타임예외상속/*부모의 타입이 들어가도 됨*/ e) {
			System.out.println("내가 발생시킨 예외 처리하기");
			// e에서 어떤 것이 예외 되었는지 불러 올 수 있음
			System.out.println(e.getMessage());
			// 콘솔창에 뜨는 빨간 문장을 출력해 볼 수 있음(흐름에 이상 없이 출력을 해주는 기능)
//			e.printStackTrace();
		}
//		System.out.println("프로그램 종료");
		
		// e == 예외 정보의 참조 
	}
}
