
public class SavingsAccount extends Account {

public SavingsAccount() {													//default account
	super();
}

public SavingsAccount(int id, double balance) {								//savings account
	super(id, balance);
}

public void withdraw(double money) {										//decreases balance
	if (money < getBalance()) {
		setBalance(getBalance() - money);
	}
	else
		System.out.println("You do not have enough money, Transaction Delcines");
	}
}

