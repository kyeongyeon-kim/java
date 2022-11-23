// 과일
// 종류
// 가격

// 과일박스
// 과일들5개
// 과일을 꺼내갈 수 있음
class Fruit {
	String type;
	int price;
	
	public Fruit(String type, int price) {
		this.type = type;
		this.price = price;
	}
}

class FruitBox {
	Fruit[] fruits;
	
	public FruitBox() {
		fruits = new Fruit[4];
		fruits[0] = new Fruit("사과", 3000);
		fruits[1] = new Fruit("오렌지", 6000);
		fruits[2] = new Fruit("포도", 9000);
		fruits[3] = new Fruit("귤", 2000);
	}
	
	// 과일을 꺼내갈 수 있음
	public Fruit getFruit(int index) {
		Fruit f = fruits[index];
		fruits[index] = null;
		return f;
	}
}

public class TestBox2 {

	public static void main(String[] args) {
		FruitBox box = new FruitBox();
		Fruit a = box.getFruit(0);
		System.out.println(a.type);
		Fruit b = box.getFruit(0);
		System.out.println(a.type);
		Fruit c = box.getFruit(0);
		System.out.println(a.type);
		Fruit d = box.getFruit(0);
		System.out.println(a.type);
	}

}
