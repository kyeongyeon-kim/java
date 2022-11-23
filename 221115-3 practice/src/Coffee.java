
public class Coffee {
	private int nameNum;
	private int sizeNum;
	private int sizePrice;
	private int hotAndIce;
	
	private final int AMERICANO = 2000;
	private final int CAFE_LATTE = 2500;
	private final int CAFFE_MOCHA = 2600;
	
	public int getSizePrice() {
		return sizePrice;
	}



	public void setSizePrice(int sizePrice) {
		this.sizePrice = sizePrice;
	}



	public Coffee(int nameNum, int sizeNum, int hotAndIce) {
		this.nameNum = nameNum;
		this.sizeNum = sizeNum;
		this.hotAndIce = hotAndIce;
	}



	public int getNameNum() {
		return nameNum;
	}



	public void setNameNum(int nameNum) {
		this.nameNum = nameNum;
	}



	public int getSizeNum() {
		return sizeNum;
	}



	public void setSizeNum(int sizeNum) {
		this.sizeNum = sizeNum;
	}






	public int getHotAndIce() {
		return hotAndIce;
	}



	public void setHotAndIce(int hotAndIce) {
		this.hotAndIce = hotAndIce;
	}



	public int getAMERICANO() {
		return AMERICANO;
	}




	public int getCAFE_LATTE() {
		return CAFE_LATTE;
	}




	public int getCAFFE_MOCHA() {
		return CAFFE_MOCHA;
	}
	
	
}
