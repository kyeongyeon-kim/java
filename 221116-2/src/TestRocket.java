public class TestRocket {
	public static void main(String[] args) {
		Rocket r1 = new Rocket(22, 44);
		System.out.println(r1.toString()); // toString 로켓의 x,y 좌표 출력
		r1.moveUp();						// moveUp 로켓의 y좌표가 1만큼 증가
		System.out.println(r1.toString());
	}

}
