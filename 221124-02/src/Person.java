import java.util.Arrays;
import java.util.Comparator;

// 사람
// 이름
// 키
// 몸무게

// Comparable 비교할 수 있는 인터페이스
public class Person implements Comparable<Person> { // 사람끼리 비교할 수 있는 사람클래스다.
	private String name;
	private int height;
	private int weight;
	
	

	@Override
	public int compareTo(Person o) { 
		return this.height - o.height;
//		if (this.height > o.height) {
//			return 1;
//		} else if (this.height == o.height) {
//			return 0;
//		} else {
//			return -1;
//		} // == return this.height - o.height;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}


	public Person(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public static void main(String[] args) {
		Person p1 = new Person("길동", 200, 80);
		Person p2 = new Person("둘리", 190, 100);
//		Person p3 = new Person("길동", 180, 80);
		Person p3 = new Person("도우너", 170, 110);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		// 대소 비교에도 기준이 있어야한다.
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		
		Comparator<Person> comp = new PersonWeightComparator();
		System.out.println(comp.compare(p1, p2));
		
		Person[] parr = new Person[] { p1, p2, p3 };
		// 정렬을 하고싶을 때
		Arrays.sort(parr);
		System.out.println(Arrays.toString(parr));
		
		Arrays.sort(parr, comp);
		System.out.println(Arrays.toString(parr));
		}

}
