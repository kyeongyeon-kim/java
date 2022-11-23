
public class Person {
	private String name;
	private int age;
	private boolean marry;
	private Pen pen;
	
	
	public Person(String name, int age, boolean marry) {
		this.name = name;
		this.age = age;
		this.marry = marry;
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
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
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", marry=" + marry + ", pen=" + pen + "]";
	}
	
}
