public class TestPerson {
	public static void main(String[] args) {
//		Person p = new Person();
//		System.out.println("사람 이름 : " + p.name);
//		System.out.println("사람 나이 : " + p.age);
//		Student s = new Student();
//		System.out.println("학생 점수 : " + s.score); // 학생의 이름과 나이도 초기화 됨
//		System.out.println(s.name);				// student(자식) 생성자를 호출하면 person(부모)의 생성자를
//		System.out.println(s.age);				//  먼저 초기화 한 다음 student 필드를 초기화함
//		System.out.println(s.score);
//		p.getScore(); 사람은 점수를 갖고 있지않음.
		// 다중상속 S S S = sub (자바는 다중상속 불가)
		// 상속을 남용하면 이해하기 어려운 코드가 될 수 있음.
		
		
		Student s = new Student("학생1번", 22, 100);
		Student s2 = new Student("학생2번", 24, 90);
		
//		System.out.println(s.getName());
//		System.out.println(s.getAge());
//		System.out.println(s.getScore());
	}
}
