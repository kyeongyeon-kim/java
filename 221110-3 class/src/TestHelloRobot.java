
public class TestHelloRobot {

	public static void main(String[] args) {
		HelloRobot robot = new HelloRobot();
		
		// 로봇의 인사 출력을 3번
		robot.printHello(3);
		// 별 한개 출력
		System.out.println("*");
		// 인사 출력을 5번
		robot.printHello(5);
	}
}
