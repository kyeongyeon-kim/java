class 구성요소 {
	
}

class 구성요소2 {
	
}

class 부모클래스 {
	
}

class 자식클래스 extends 부모클래스 implements 상위인터페이스 {
	private 구성요소 fields;
	private 구성요소2 fields2;
	
	public 자식클래스(구성요소2 fields2) {
		this.fields = new 구성요소();
		this.fields2 = fields2;
	}
}

interface 상위인터페이스 {
	
}

public class Main {

}
