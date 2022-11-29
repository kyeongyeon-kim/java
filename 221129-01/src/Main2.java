
public class Main2 {
	public static void main(String[] args) {
		int primitive = 100;
		// 포장하여 객체의 형태로 !
		Integer ref = Integer.valueOf(primitive);
		int unbox = ref.intValue();
		// reference (레퍼 클래스) ex) Integer
		// 기본형자료를 포장 해줌(객체로 만들어 주어 참조 할 수 있게끔)
		// 기본형자료 -> 객체 (boxing, 박싱)
		// 반대로 객체 -> 기본형 (unboxing, 언박싱)
		// 손이 많이 가는 작업 !
		
		// 그래서 대입연산만으로도 표현가능 (편하게 쓰기위해 허용) auto-boxing, 오토박싱
		Integer ref2 = primitive;
		// unboxing
		int unbox2 = ref2;
		
		Boolean b = Boolean.valueOf("true");
		System.out.println(b);
		
		// <기본형의 박싱방법>
//		boolean - Booolean
//		char - Charcater
//		byte - Byte
//		short - Short
//		int - Integer
//		long - Long
//		float - Float
//		double - Double
		
		System.out.println(Integer.SIZE);
	}

}
