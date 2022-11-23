// 넓이를 구할 수 있는 밑변과 높이를 가지는 삼각형
// 


public class Triangle {
	int botDis;
	int height;
	
	double getArea() {
		double area = (botDis * height) / 2.0;
		return area;
	}
}
