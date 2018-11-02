
public class CheckingAccount extends Account {

private double overdraftLimit;										//data fields

public CheckingAccount() {											//default account
	super();
	overdraftLimit = -20;
}

public CheckingAccount(int id, double balance, double overdraftLimit) {	//checking account
	super(id, balance);
	this.overdraftLimit = overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit) {					//sets overdraft limit
	this.overdraftLimit = overdraftLimit;
}

public double getOverdraftLimit() {										//gets overdraft limit
	return overdraftLimit;
}

public void withdraw(double money) {									//decrease balance
	if (getBalance() - money > overdraftLimit) {
		setBalance(getBalance() - money);
	}
	else
		System.out.println("You have exceeded overdraft limit");
}

public String toString() {												//displays
	return super.toString() + "\nOverdraft limit: $" + overdraftLimit;
}
}

