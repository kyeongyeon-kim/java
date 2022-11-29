// 은행계좌
// 잔고

// -입출금, -이체 예외적 상황 
// 입금하기(금액) throws 자유이름예외... 왜 입금, 출금, 이체가 안되는지
// 출금하기(금액)
// 이체하기(은행계좌, 금액)

class NegativeIntegerException extends RuntimeException {
	public NegativeIntegerException(String message) {
		super(message);
	}
}

public class BankAccount {
	private int money;
	
	public void deposit(int money) {
		if (money > 0) {
			this.money += money;	
		} else {
			throw new NegativeIntegerException("음수의 금액을 입금할 수 없습니다.");
		}
		
	}
	
	public void withdraw(int money) {
		if (this.money >= money) {
			this.money -= money;
		} else {
			throw new NegativeIntegerException("잔고가 부족합니다. 부족한 금액 " + (money - this.money));
		}
		
	}
	
	// 내가 만든 것
	public void accountTransfer (int money, BankAccount a) {
		if (a == null) {
			throw new NullPointerException("상대 계좌 참조가 전달되지 않았습니다.");
		} else if (this.money < money) {
			throw new NegativeIntegerException("잔고가 부족합니다. 부족한 금액 " + (money - this.money));
		} else if (money < 0) {
			throw new NegativeIntegerException("음수의 금액을 이체할 수 없습니다.");
		} else {
			this.money -= money;
			a.money += money;
		}
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		BankAccount account2 = new BankAccount();
		account.deposit(10000);
		
		account.accountTransfer(3000, account2);
		
		System.out.println(account.money);
		System.out.println(account2.money);
	}

}
