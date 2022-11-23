
public class Pen {
	private int price;

	public Pen(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void write(String line) {	//펜의 문자열을 쓸 수 있는 기능
		System.out.println(line);
	}
}
