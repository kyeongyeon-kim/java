// 187p
// 1번
// 3번
// 4번
// 6번
// 7번

// p220p
// 1번
class Another {
	static int b = 20;
	int c = 30;
	
	static void method() {
		b = 33;
		
		
	}
}

public class Main {
	static int a = 10;
	
	void insMethod() {
		Another.b = 45;
	}
	
	public static void main(String[] args) {
		a = 66;
		Another.b = 33;
	}

}
