
public class Person extends Object {
	private String name;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (this == o) {
			return true;
		}
		if (!(o instanceof Person)) {
			return false;
		}
		Person otherPerson = (Person) o;
		
		return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
	}
	
	// override : 메소드를 재정의하는 행동(부모의 메소드를 물려받을 때 동작을 다르게 하고싶다면~)
	@Override // 부모의 메소드 중 이렇게 생긴 메소드를 오버라이드하려고하는데 똑같은 헤더가 없다면 알려줌
	public String toString() {
		return "재작성된 메소드 : " + name
				+ ", " + age;
	}
}
