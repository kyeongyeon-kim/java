
public class TestWallet {
	public static void main(String[] args) {
		Wallet my = new Wallet(10000);
		System.out.println(my.getMoney());
		
		Store s = new Store();
		s.payment(my);
		
		System.out.println("결재후 : " + my.getMoney());
	}
}
