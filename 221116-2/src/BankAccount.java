public class BankAccount {
	private int balance;
	
	

	public void trasfer(int amount, BankAccount otherAccount) {
		this.balance -= amount;
		otherAccount.balance += amount;
	}
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
}
