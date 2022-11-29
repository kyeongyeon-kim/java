
public abstract class MyAbstClass {
	// 추상 메소드를 가질수도 그렇지 않을수도 있음(추상메소드는 무조건 추상클래스안에 있어야함)
	private String field1;
	private int number1;
	
	public MyAbstClass(String field1, int number1) {
		this.field1 = field1;
		this.number1 = number1;
	}
	
	public abstract void 추상메소드1(); // 부모클래스에서 구현 할 수 없는 메소드들은 추상메소드를 활용

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
}
