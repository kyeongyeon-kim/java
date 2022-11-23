//의자
//제조사
//모델명
//가격
//높이조절여부
public class Chair {
	private String manufacturer;
	private String modelName;
	private int price;
	private boolean upAndDown;
	

	
	
	public Chair(String manufacturer, String modelName, int price, boolean upAndDown) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.price = price;
		this.upAndDown = upAndDown;
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isUpAndDown() {
		return upAndDown;
	}
	public void setUpAndDown(boolean upAndDown) {
		this.upAndDown = upAndDown;
	}
}
