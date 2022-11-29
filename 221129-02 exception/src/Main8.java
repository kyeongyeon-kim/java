
public class Main8 {
	public static void main(String[] args) {
		
		// finally 블럭 : try와 catch에 상관없이 무조건 실행된다.
		// catch가 없어도 무조건 실행
		// finally블럭의 의미 : 동작을 끝내기위한 의미, 다른 프로세서가 사용할 수 있도록 .. 등등
		try {
			System.out.println("try 블럭");
			throw new Exception();
		} catch(RuntimeException e) {
			System.out.println("런타임 예외 처리 블럭");
		} catch(Exception e) {
			System.out.println("예외 처리 블럭");
		} finally {
			System.out.println("finally 블럭");
		}
	}
}
