// 책
// p257 예제
// p258 예제

// 휴대폰 클래스 Phone 작성
// 제조사, 가격, 통신타입(2g, 3g, 4g...등)의 정보
// 스마트폰 클래스 SmartPhone 작성
// 제조사, 가격, 통신타입(2g, 3g, 4g...등), 운영체재(ios, android..등), 내부메모리 크기 등의 정보

// 스마트폰의 동등함을 확인가능한 메소드(equals) 재정의하기
// 스마트폰의 경우 (제조사, 모델명)이 동일한 경우 같은 스마트폰입니다.
class Shape {
	public double getArea() {
		return 0;
	}
	public Shape() {
		super();
	}
}
class Rectangle extends Shape {
	private double width, height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
}
class Triangle extends Shape {
	private double base, height;
	
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
}

public class ShapeAreaTest{
	public static void main(String[] args) {
		Shape obj1 = new Rectangle(10.0, 20.0);
		Shape obj2 = new Triangle(10.0, 20.0);
		
		System.out.println("Rectangle : " + obj1.getArea());
		System.out.println("Triangle : " + obj2.getArea());
	}
}
