package test;
interface 스마트폰 {
	void 전화기능();
	void 문자기능();
}

class 아이폰 implements 스마트폰 {
	public void 전화기능() {
		
	}
	
	public void 문자기능() {
		
	}
}

class 삼성폰 implements 스마트폰 {
	public void 전화기능() {
		
	}
	
	public void 문자기능() {
		
	}
}

class 부모님 {
	public static void main(String[] args) {
		사람 h = new 사람(new 아이폰());
		사람 h2 = new 사람(new 삼성폰());
		
//		스마트폰 s = new 오우거(new 삼성폰());
//		스마트폰 s2 = new 사람(new 아이폰());
		
		동작 o = new 오우거(new 삼성폰());
		동작 o2 = new 사람(new 아이폰());
	}
}
interface 동작 {
	void 걷기();
	void 달리기();
}

class 오우거  implements 동작 {
	private 스마트폰 폰;

	public 오우거(스마트폰 폰) {
		super();
		this.폰 = 폰;
	}

	@Override
	public void 걷기() {
		
	}

	@Override
	public void 달리기() {
		
	}
	
}

public class 사람 implements 동작  {
	private 스마트폰 폰;
	
	public 사람(스마트폰 폰) {
		this.폰 = 폰; 
	}
	
	void 전화하기() {
		폰.전화기능();
	}
	
	void 문자보내기() {
		폰.문자기능();
	}

	@Override
	public void 걷기() {
		
	}

	@Override
	public void 달리기() {
		
	}
}
