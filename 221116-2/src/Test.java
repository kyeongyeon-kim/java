class Point{
	int x, y;
	public void sub(Point p) {
		p.x = 100;
		p.y = 200;
	}
}
public class Test {
	public static void main(String[] args) {
			Point obj = new Point();
			obj.sub(obj);
			System.out.println(obj.x + ", " + obj.y);
	}
}
