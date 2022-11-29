
class Phone {
	protected String manufacturer;
	protected int price;
	protected String gType;
	
	public Phone(String manufacturer, int price, String gType) {
		super();
		this.manufacturer = manufacturer;
		this.price = price;
		this.gType = gType;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getgType() {
		return gType;
	}


	public void setgType(String gType) {
		this.gType = gType;
	}


	@Override
	public String toString() {
		return "Phone [manufacturer=" + manufacturer + ", price=" + price + ", gType=" + gType + "]";
	}
	
	
}
class SmartPhone extends Phone{
	private String modelName;
	private String OS;
	private int memorySize;
	
	
	public SmartPhone(String manufacturer, int price, String gType, String modelName, String oS, int memorySize) {
		super(manufacturer, price, gType);
		this.modelName = modelName;
		OS = oS;
		this.memorySize = memorySize;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getOS() {
		return OS;
	}


	public void setOS(String oS) {
		OS = oS;
	}


	public void getMemorySize() {
		System.out.println(memorySize + "GB");
	}


	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}


	@Override
	public String toString() {
		return "SmartPhone [제조사 : " + super.manufacturer + ", 가격 : " + super.price + 
				", GenerationType" + super.gType
				+ ", 모델명 : " + modelName + ", 운영체제 : " + OS + ", 내장메모리크기 : " + memorySize + "GB]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SmartPhone))
			return false;
		SmartPhone other = (SmartPhone) obj;
		if (super.manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!super.manufacturer.equals(other.manufacturer))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	
	
	
}
public class TestPhone {
	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone("애플", 1000_000, "4G", "아이폰13", "ios", 128);
		SmartPhone sp2 = new SmartPhone("삼성", 1500_000, "5G", "갤럭시22", "android", 256);
		SmartPhone sp3 = new SmartPhone("삼성", 1500_000, "5G", "갤럭시Z플립4", "android", 256);
		SmartPhone sp4 = new SmartPhone("애플", 1500_000, "5G", "아이폰13", "android", 64);
		
		System.out.println(sp1.equals(sp2));
		System.out.println(sp1.equals(sp3));
		System.out.println(sp1.equals(sp4));
		
		sp1.getMemorySize();
		sp2.getMemorySize();
		sp3.getMemorySize();
		sp4.getMemorySize();
		
		System.out.println(sp1.toString());
		System.out.println(sp2.toString());
		System.out.println(sp3.toString());
		System.out.println(sp4.toString());
	}
}
