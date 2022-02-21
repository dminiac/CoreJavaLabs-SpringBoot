public class Account extends Person {

	private long accNum;
	private double balance;
	private Person accholder;

	Account() {
	}

	Account(long accNum, double balance, Person accholder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accholder = accholder;
	}

	Account(String name, float age, long accNum, double balance) {
		super(name, age);
		this.accNum = accNum;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) { // overiding method
		if (balance > amount) {
			balance = balance - amount;
			return true;
		} else {
			return false;
		}
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccholder() {
		return accholder;
	}

	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}

}