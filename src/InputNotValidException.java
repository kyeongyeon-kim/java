// 언체크 예외로 예외 클래스 만들어보기
public class InputNotValidException extends RuntimeException {
	public InputNotValidException(String message) {
		super(message);
	}
	
}
