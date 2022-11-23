
public class Circle {
	private int radius;
	public final double PI = 3.14;

	public double getPi() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
	public double getRound() {
		return 2 * radius * PI;
	}
}	
