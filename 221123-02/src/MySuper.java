
public class MySuper {
	protected String 부모의문자열필드;
	// protected 자기자신도 사용가능 상속하는 클래스도 사용가능
	// class 앞에 final 키워드를 붙일 수 있음(종단 클래스) 더이상 상속이 불가능한 클래스
	protected void 부모의메소드() {
		
	}
}

class MySub extends MySuper {
	public String 부모의문자열필드;
	
	public void 부모의문자열필드에접근하는메소드() {
		System.out.println(super.부모의문자열필드); 
		// this도 가능 super도 가능 
		// 같은 필드명이 자신에게도 있다면 this일땐 내 필드 super일땐 부모 필드
		// 하지만하지않는것이 제일 좋다(헷갈림)
	}
	public void 부모의메소드() {
		
	}
	public void 부모의메소드를호출하는자식메소드() {
		super.부모의메소드();
		//메소드도 필드와 마찬가지 (필드와 다르게 문법적으로 많이 사용하는 ..)
	}
}												
