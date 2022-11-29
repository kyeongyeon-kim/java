
public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("이름1", 22);
		System.out.println(p.toString());
		
		Person p2 = new Person("이름2", 33);
		Person p3 = new Person("이름1", 22);
		
		System.out.println(p == p2);
		System.out.println(p == p3);
		
		// equals는 같은 참조일때만 참
		System.out.println(p.equals(p2));
		System.out.println(p.equals(p3));
	}
}
