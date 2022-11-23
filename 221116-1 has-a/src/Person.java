
public class Person {
	String name;
	int age;
	private Pen pen; // 사람이 펜을 갖고 있는 것을 표현
	
	public Person(String name, int age, Pen pen) {
		this.name = name;
		this.age = age;
		this.pen = pen;
	}
	public void writeOwnName() { //사람은 펜을 가지고 있는데 사람은 글자를 적을 수 있다.
		pen.write(name);
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

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
