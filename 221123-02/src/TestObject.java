import java.util.Scanner;

public class TestObject {
	public static void main(String[] args) {
		MySuper m = new MySuper();
		
		System.out.println(m.hashCode());
		// 우리가 정의하지않은 메소드들이 정의되어있고 동작을 한다. 
		// 자바에서의 상속계층구조때문에 그렇다.(우리가 모르는 부모가 있다. 그 부모의 이름은 object)
		// 모든 클래스들의 부모는 object
		// ex)toString같은 메소드 오브젝트메소드
		
		Object o = new MySuper();
		Object o2 = "asdf";
		Object o3 = new Scanner(System.in);
		
	}

}
