// 동물
// 이름
// 나이
class Animal {
	String name;
	int age;
}

// 새 class
// 날 수 있음
class Bird extends Animal {
	void fly() {
		System.out.println("새가 날아갑니다~");
	}
}

// 독수리
// 사냥
class Eagle extends Bird {
	@Override
	void fly() {
		System.out.println("독수리는 빠르게 납니다.");
	}
	
	void hunt() {
		System.out.println("독수리는 사냥을 합니다~");
	}
}

// 비둘기
// 구구 소리 낼 수 있음
class Pigeon extends Bird {
	void googoo() {
		System.out.println("구구구");
	}
}

public class Main {
	public static void main(String[] args) {
		Eagle e = new Eagle();
		e.fly();
		
		
		
		
		
		//		Bird[] birds = {new Eagle(), new Pigeon()};
//		// 둘 다 새니까 가능한 문장
//		
//		for (int i = 0; i < birds.length; i++) { // 독수리만 찾아서 다운캐스팅
//			if(birds[i] instanceof Eagle) { //instaceof 같은 클래스에서 만들어진 인스턴스를 참조할 때 true
//				((Eagle)birds[i]).hunt();
//			}
//		}
		
		
		
		
		
		//		Bird e = new Eagle(); // Bird e = (Bird)new Eagle() == 같은말
								// e라는 참조변수는 Bird를 참조한다. 독수리는 새라서 말이 된다.(객체의 다형성)
//		e.fly();				// 형변환이 일어났는데 부모에서 > 자식으로 상향 형변환 (업캐스팅)
//		e.hunt();불가능			// new Eagle이라는 인스턴스는 Bird형을 참조한다.
		
//		Eagle eagle = (Eagle) e;// 다운캐스팅의 경우 명시를 해줘야함(어디로 갈지 모르기때문)
//		eagle.hunt();
		
//		Bird b = new Bird();
//		b.fly();
//		Bird b = new Pigeon();// 비둘기와 독수리는 연관관계가 없음.
//		b.fly();
		
//		Eagle e = (Eagle) b; // 새로 태어난 인스턴스는 독수리가 될 수 없다.(다운캐스팅 해줘야함)
//		e.hunt();//(에러)
		
		
		
		
		
		
		
		
//		Bird b = new Bird();
//		b.fly();
//		
//		b.hunt();
//		b.googoo();
		
//		Eagle e = new Eagle();
//		e.fly();
//		e.hunt();
//		e.googoo();
		
//		Pigeon p = new Pigeon();
//		p.fly();
//		p.hunt();
//		p.googoo();
	}
}
