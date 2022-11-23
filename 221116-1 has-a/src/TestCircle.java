public class TestCircle {
	public static void main(String[] args) {
		// 중심 좌표가 (2, 4) 반지름이 5
		Point p = new Point(2, 4);
		Circle c = new Circle(p, 5);
//		Circle c = new Circle(new Point(2, 4), 5); //변수로 만들지 않고 인스턴스 생성으로 바로 파라미터에 적용가능
		
		// 위의 원 c의 중심점 (5, 7) 변경
//		Point center = c.getCenter();
//		c.getCenter().setX(5);
//		c.getCenter().setY(7);
		
		c.setCenter(new Point(5, 7));
		
		// 위의 원 c의 중심점 x, y좌표를 알아봅시다.
//		Point center = c.getCenter();
//		int x = center.getX();
//		int y = center.getY();
//		int x = c.getCenter().getX();
//		System.out.println(x);
	}
}
