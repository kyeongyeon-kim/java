
public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);

		System.out.println("반지름 : " + c.getRadius());
		System.out.println("파이 : " + c.getPi());
		System.out.println("원넓이 : " + c.getArea());
		System.out.println("원둘레 : " + c.getRound());
	}
}
