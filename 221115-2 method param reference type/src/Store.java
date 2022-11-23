
public class Store {
	public void payment(Wallet w) {
		int current = w.getMoney();
		w.setMoney(current - 1000);
	}
}
