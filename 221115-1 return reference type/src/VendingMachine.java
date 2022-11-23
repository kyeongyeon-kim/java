
public class VendingMachine {
	public Drink drinkInfo(int no) {
		if(no == 1) {
			Drink d = new Drink("콜라", 1900, 250);
			return d;
		} else if (no == 2) {
			Drink d = new Drink("사이다", 1700, 250);
			return d;
		} else if (no == 3) {
			Drink d = new Drink("커피", 1800, 210);
			return d;
		} else {
			return null;
		}
	}
}
