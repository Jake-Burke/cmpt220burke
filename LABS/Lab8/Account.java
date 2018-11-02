import java.util.Date;

public class Account {
	private int id;												//data fields
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	Account() {													//no arg constructor
		this(0, 0); 
	}

	Account(int id, double balance) {							//account inital balance
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

																// Mutator methods
	public void setaccountNumber(int id) {						//set id 
		this.id = id;
	}

	public void setBalance(double balance) {					//set balance
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {	//set Interest Rate
		this.annualInterestRate = annualInterestRate;
	}

																	// Accessor methods
	public int getid() {											//get id
		return id;
	}

	public double getBalance() {									//get balance
		return balance;
	}

	public double getAnnualInterestRate() {							//get Interest Rate
		return annualInterestRate;
	}
								
	public String getDateCreated() {								//get Date
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {						//gets Monthly Interest
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {							//Get Monthly Interest Method
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {							//WithDraw Method
		balance -= amount;
	}


	public void deposit(double amount) {							//Deposit Method
		balance += amount;
	}

	
	public String toString() {										//display method
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()+ "\nBalance: $" +  balance + 
			"\nMonthly interest: $" + getMonthlyInterest();
	}
}
