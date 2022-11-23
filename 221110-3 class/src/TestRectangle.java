
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.width = 20;
		r.height = 30;
		
		int perimeter = r.getPerimeter();
		System.out.println("계산된 둘레값 : " + perimeter);
		
		int area = r.getArea();
		System.out.println("계산된 넓이값 : " + area);
		
		System.out.println("프로그램 종료");
	}

}
