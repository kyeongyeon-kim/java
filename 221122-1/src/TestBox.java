// 인형
// 종류
// 가격

// 인형박스
// 인형여러개
class Doll {
	String type;
	int price;
	
	public Doll(String type, int price) {
		this.type = type;
		this.price = price;
	}
}


class DollBox {
	// 인형여러개	
	Doll[] dolls;

	public DollBox(Doll[] dolls) { //221121-1 Main9 참고
		this.dolls = dolls;
	}
	
	public int getPriceByIndex(int index) {
		if (dolls != null 
				&& index >= 0 
				&& index < dolls.length) {
			return dolls[index].price;
		}
		return -1;
	}
	
	// 인형의 이름으로 검색하여(처음부터 끝까지)하여 찾은 인형의 가격 알려주기
	public int getPriceByType(String type) {
		if (dolls == null || dolls.length == 0) {
			return -1;
		}
		for(int i = 0; i < dolls.length; i++) {
			Doll d = dolls[i];
			if (d.type.equals(type)) {
				return d.price;
			}
		}
		return -1;
	}
		

}
public class TestBox {
	public static void main(String[] args) {
		DollBox box = new DollBox(new Doll[] {new Doll("처키", 10000)
											, new Doll("허기워기", 20000)
											, new Doll("바비", 30000)});
		System.out.println(box.dolls[0].type);
		System.out.println(box.getPriceByIndex(3));
		System.out.println(box.getPriceByType("처키"));
		System.out.println(box.getPriceByType("허기워기"));
		System.out.println(box.getPriceByType("둘리"));
		
	}
}
