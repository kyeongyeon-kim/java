
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

	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}
}
