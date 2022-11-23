
public class TestPadding {

	public static void main(String[] args) {
		Padding pd1 = new Padding();
		pd1.price = 300000;
		pd1.material = "오리털";
		pd1.discountRate = 10;
		
		double dcPrice = pd1.getDcPrice(); 
			System.out.println("할인된 판매 가격 : " + dcPrice + "원");
		
		Padding parka = new Padding();
		parka.price = 700000;
		parka.material = "거위털";
		parka.discountRate = 50;
		
		System.out.println("할인된 판매 가격 : " + parka.getDcPrice() + "원");
		
			
			
	}

}
