import java.io.Serializable;
//  Serializable 직렬화
public class Person implements Serializable {
	private String name;
	private int age;
	private double height;
	private String hobby;
	public Person(String name, int age, double height, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.hobby = hobby;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", hobby=" + hobby + "]";
	}
}
