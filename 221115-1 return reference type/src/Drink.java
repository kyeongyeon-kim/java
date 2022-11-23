
public class Drink {
	private String name;
	private int price;
	private int volume;
	
	public Drink(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String toString() {
		return "캔명 : " + name + "\n"
					+ "가격 : " + price + "\n"
					+ "용량 : " + volume + "\n";
	}
}
