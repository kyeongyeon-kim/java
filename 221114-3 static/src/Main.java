public class Main {
	private int a = 10; // 필드는 클래스를 가지고 인스턴스화 해줘야 그 클래스에 정의 되어있는 필드를 사용가능
	
	 // 정적(static 변수) 실행흐름 시작부터 이미 존재하는 변수로서 정적으로 존재 프로그램 끝날 때 까지
	private static int myVar = 10;
	
	private static void printVar() {
		System.out.println(myVar);
//		System.out.println(a); // a는 인스턴스화가 이루어진 후에 실행 될 수 있음
	}
	// 클래스 로드시 JVM이 정적인 표현이 있는지 확인하고 값을 만들어 놓음
	// ex) 메인메소드가 대표적인 정적인 표현, 로드하면서 메인메소드를 미리 만들어놓음
	// = 클래스 변수
	static {
		System.out.println("프로그램 시작보다 먼저 실행됩니다.");
	}
	
	public static void main(String[] args) {
		Main.printVar();
		System.out.println(Circle.PI);
//		System.out.println("프로그램 시작");
//		System.out.println(Main.myVar);
//		Main.myVar = 8;
//		System.out.println(Main.myVar);
//		System.out.println("프로그램 종료");
		
		
		//동적 : 실행흐름에서 만나야지 그때서야 이뤄진다는 의미 / 정적 <=> 동적
//		Main m = new Main();
//		System.out.println(m.a);
//		
//		m.a = 9;
//		System.out.println(m.a);
	}

}
