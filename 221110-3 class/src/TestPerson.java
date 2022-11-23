
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "길동";
		p1.age = 22;
		
		Person p2 = new Person();
		p2.name = "경연";
		p2.age = 27;
		
		p1.introduce();
		p2.introduce();
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p1.name = "마이콜";
		p1.introduce();
		
		System.out.println("프로그램 종료");
//		System.out.println(p1.name);
//		System.out.println(p2.name);
		// 3번째 사람
//		Person p3 = new Person();
//		Person p4 = p1;
//		
//		Person p5 = null;
//		Person p6;
//		
//		System.out.println(p5);
//		System.out.println(p6);
		
	}

}
