// 패딩 클래스
// 실제가격
// 소재 (오리털, 거위털 ... 등등)
// 현재할인율

// 할인율을 적용한 현재가격을 계산하여 반환하는 메소드


public class Padding {
	
	String material;
	int price;
	double discountRate;
	
	double getDcPrice() {
		double dcPrice = price * ((100 - discountRate) / 100.0);
		return dcPrice;
	}
}
