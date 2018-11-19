public class BankAccount {
	private static long generatedAccountNumber = 100000001L;
	
	private double balance;
	private long accountNumber;
	private int pin;
	private AccountHolder person;
	public BankAccount(double balance, int accountNumber, int pin, AccountHolder) {
		this.balance = balance;
		this.accountNumber = acccountNumber;
		this.pin = pin;
	}
	
	public double getBalance() {
		return balance;
	}
	public double setBalance(String balance2) {
		this.balance= balance2;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber (long accountNumber) {
		this.accountNumber= accountNumber;
	}
	
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin= pin;
	}
	
	public int getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(AcountHolder) {
		this.AccountHolder= AccountHolder;
	}
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			
			return 1;
		}
		if (return != 1){
			System.out.println("Invalid deposit amount.");
		}
	}
	
	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;
			return 2;
		}
	}

	public void setBalance(double d) {
		// TODO Auto-generated method stub
		
	}
}