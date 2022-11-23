// 은행 계좌
// 잔고

// 잔고를 알려줄 수 있는 메소드
// 입금 메소드
// 출금 메소드
public class BankAccount {
	private int balance = 0;
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		if (money > 0) {
			balance += money;
		}
	}
	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
		}
	}
}
