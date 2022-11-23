
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		System.out.println(account.getBalance());
		
		account.deposit(5000);
		System.out.println(account.getBalance());
		
		account.withdraw(3000);
		System.out.println(account.getBalance());
		
	}

}
