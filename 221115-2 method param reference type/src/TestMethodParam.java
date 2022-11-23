
public class TestMethodParam {
	public static void decrease(int money, Wallet w) {
		money -= 1000;
		w.setMoney(w.getMoney() - 1000);
	}
	
	public static void main(String[] args) {
		int money = 10000;
		Wallet w = new Wallet(10000);
		
		decrease(money, w);
		
		System.out.println("지역변수 money값 : " + money);
		System.out.println("지역변수 지갑 참조 필드값 : " + w.getMoney());
	}
}
