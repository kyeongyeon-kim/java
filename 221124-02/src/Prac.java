
// 간접적인 다중상속을 제공하는 기능 => 인터페이스
interface 날수있음 { // 인터페이스에 추상적인 메소드를 포함 할 수 있음
	void fly(); // 메소드만 존재가능하고 필드도 존재 할 수 없음
	//abstract 키워드를 생략해도 됨
}
interface 사냥할수있음 {
	void hunt();
}

class Bird {

}
// 인터페이스는 다중으로 포함시킬 수 있음
class Eagle extends Bird implements 날수있음, 사냥할수있음 {
	@Override
	public void fly() {
		System.out.println("독수리가 납니다.");
	}
	public void hunt() {
		System.out.println("독수리가 사냥함.");
	}
	// 날 수 있는 새로 만들고 싶음
	// 구현한다는 의미로 implements 키워드를 포함시켜야함
	 
}
class Lion implements 사냥할수있음 {
	@Override
	public void hunt() {
		System.out.println("사자가 사냥함.");
	}
}
class Plane implements 날수있음 {
	@Override
	public void fly() {
		System.out.println("비행기가 납니다.");
	}
}

class Chicken extends Bird {
	
}
public class Prac {
	public static void main(String[] args) {
		날수있음 p = new Plane();
		p.fly();
		
		Bird b = new Bird();
//		Bird e = new Eagle();
		// 새의 형으로는 날 수 없음, 인터페이스타입으로 업캐스팅이 가능함
		날수있음 e = new Eagle();
//		Eagle e = new Eagle();
		e.fly();
		
		날수있음[] flys = {p, e};
		for (날수있음 f : flys) {
			f.fly();
		}
		// 추상클래스 : 필드, 메소드 가질 수 있음, 상속으로 무조건 이어진다
		// 인터페이스 : 추상적인 메소드로만 이루어져있다. 여러개의 인터페이스를 구현하는 클래스는 만들 수 있다.(스스로 인스턴스화 할 수 없음)

		
	}

}
