// 사람
// 이름
// 나이

// 이름 알려주기
// 이름 변경하기
// 나이 알려주기
// 나이 변경하기
public class Person {
	private String name;
	private int age;
	
	// overload (다양한 파라미터 형태)
	// 오버로드는 파라미터의 타입, 개수, 순서가 중요 
	public Person() {
	}
	
	public Person(String name) {
		this(name, 1); // 자기 자신의 생성자 호출
		
		System.out.println("name 필드 초기화 완료");
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() { // getter (접근자)
		return age;
	}
	public void setAge(int age) { // setter (설정자)
		this.age = age;
	}
}
