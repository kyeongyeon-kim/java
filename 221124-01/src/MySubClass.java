
public class MySubClass extends MyAbstClass {
	private String subField;
	
	public MySubClass(String field1, int number1, String subField) {
		super(field1, number1);
		this.subField = subField;
	}


	@Override
	public void 추상메소드1() {
		System.out.println("자식에서 무조건 재정의");
	}
}
