
public class AccountTest {
	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);						
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println(account.toString());
		
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		savings.setAnnualInterestRate(4.5);
		savings.withdraw(2500);
		savings.deposit(3000);
		System.out.println(savings.toString());
		
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		checking.setAnnualInterestRate(4.5);
		checking.withdraw(2500);
		checking.deposit(3000);
		System.out.println(checking.toString());

	}
}

		

