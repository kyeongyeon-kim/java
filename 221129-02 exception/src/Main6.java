
public class Main6 {
	// 예외처리를 발생시킨 시점에서 하지않고 던지겠다 > throws (부모타입 명시가능)
	public static void 예외발생메소드() throws My예외상속 {
		System.out.println("메소드 호출");
		
		// Exception클래스를 상속받는 모든 클래스는 예외체크가 필요함 (checked Exception) 발생시킨 시점에서 예외처리가 필요함
		// RuntimeException클래스는 예외체크가 필요하지 않음(unchecked Exception)
		boolean 예외적상황 = true;
		if (예외적상황) {
			throw new My예외상속("예외 발생");
		}
		System.out.println("메소드 반환");
	}
	
	
	public static void main(String[] args) {
		try {
			예외발생메소드();
		} catch (My예외상속 e) {
			System.out.println("checked 예외처리");
		}
		
	}

}
