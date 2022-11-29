
// Student,Author,Employee는 사람이라서 이름, 나이를 모두 갖고 있다.

public class Person {
	// 이름
	private String name;
	// 나이
	private int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
//	public Person() {
//		//super();
//		System.out.println("부모의 생성자 호출");
//	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}




















//class Author extends Person {
//	// 소속출판사
//	String publisher;
//}
//
//class Employee extends Person {
//	// 연봉
//	double salary;
//}
