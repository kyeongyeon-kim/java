
public class TestPerson {

	public static void main(String[] args) {
		// 생성자(constructor) 호출
		// 기본값
		// 참조형 null
		// 정수형 0
		// 실수형 0.0
		// 논리형 false
		Person p1 = new Person("길동", 22); //  <- 생성자 필드를 초기화 하기 위한 것
		
//		p1.setName("길동");
//		p1.setAge(22);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person p2 = new Person("둘리", 33);
		
		Person p3 = new Person();
		
		Person p4 = new Person("희동");
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
	}

}
