// 형제 Brother
// 자매 Sister
// 키 Key

// 퍼블릭한 클래스는 하나만 있어야함.
class Brother {
	Key key;
}

class Sister {
	Key key;
}

class Key {
	
}


public class Test {
	public static void main(String[] args) {
		Key key = new Key();
		Brother b = new Brother();
		b.key = key;
		Sister s = new Sister();
		s.key = key;
		
		System.out.println(s.key == b.key);
	}

}
