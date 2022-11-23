public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		System.out.println("a1 : " + a1); // 문자열로 인식하면 객체가 출력 될 때 자동으로 toString이 자동으로 호출됨
		System.out.println("a2 : " + a2);
		
		a1.trasfer(1000, a2);
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
	}

}
