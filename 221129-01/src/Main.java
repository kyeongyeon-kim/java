
public class Main {

	public static void main(String[] args) {
		String numbers = "12345";
		// 문자열 결합이 일어나게 됨 ( 문자열 + 정수 )
		System.out.println(numbers + 100);
		
		
		
		// 문자열을 정수와 결합할 수 있도록 해주는 클래스 ( Integer)의 (parseInt, valueOf) 메소드
		// 용도 : 자바에서 다루는 기초형 타입들은 객체가 아님. 기본형 타입들을 객체로 만들어주는 클래스
		System.out.println(Integer.parseInt(numbers));
//		Integer.valueOf(s);
	}

}
