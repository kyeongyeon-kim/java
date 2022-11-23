
public class Dog {
	private String name;
	public String breed;
	private int age;
	
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog(String name, int age) {
		this(name, "시골잡종개", age);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "강아지의 이름 : " + name + "\n"
			+ "강아지의 종류 : " + breed + "\n"
			+ "강아지의 나이 : " + age + "\n";
	}
	public String barking() {
		return "왈왈";
	}
	
}
