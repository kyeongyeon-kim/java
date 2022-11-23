// 직사각형
// 필드
// 가로
// 세로

// 직사각형 스스로의 가로 길이와 세로길이를 콘솔에 출력하는 메소드

public class Rectangle {
	int width;
	int height;
	
	// 넓이 구하는 메소드
	// head
	// 반환형 메소드이름(파라미터)
	int getArea() {
		int area = width * height;
		return area;
	}
	
	// 둘레를 구해서 int형으로 반환하는 메소드
	int getPerimeter() {
		int perimeter = (width + height) * 2;
		return perimeter;
	}
	
	
	void printState() {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
	}
}
