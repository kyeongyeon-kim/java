
public class TestTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.botDis = 30;
		t1.height = 30;
		
		double area = t1.getArea();
			System.out.println("삼각형의 넓이는 : " + area);
	}

}
