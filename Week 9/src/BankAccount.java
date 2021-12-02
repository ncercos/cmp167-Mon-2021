/**
 * 
 * @author Nicholas Cercos
 *
 */
public class BankAccount {
	
	// Variables
	
	private String bankName;
	private String accountOwner;
	private double balance;
	private long routingNumber;
	private long accountNumber;
	
	// Constructors
	
	public BankAccount() {
		this.bankName = "Chase";
		this.accountOwner = "Nicholas Cercos";
		this.balance = 100.0;
		this.routingNumber = 123456789;
		this.accountNumber = 987654321;
	}
	
	public BankAccount(String bankName, String accountOwner, double balance, long routingNumber, long accountNumber) {
		this.bankName = bankName;
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.routingNumber = routingNumber;
		this.accountNumber = accountNumber;
	}
	
	// Setters
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setRoutingNumber(long routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// Getters

	public String getBankName() {
		return bankName;
	}
	
	public String getAccountOwner() {
		return accountOwner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public long getRoutingNumber() {
		return routingNumber;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	// Misc
	
	public boolean equals(Object obj) {
		if(obj == null)return false;
		if(this == obj)return true;
		if(obj instanceof BankAccount) {
			BankAccount ba = (BankAccount)obj;
			return this.bankName.equals(ba.getBankName()) &&
					this.accountOwner == ba.getAccountOwner() &&
					this.balance == ba.getBalance() &&
					this.routingNumber == ba.getRoutingNumber() &&
					this.accountNumber == ba.getAccountNumber();
		}
		return false;
	}
	
	public String toString() {
		return "Bank Account: Name = " + getBankName() + ", Owner = " + getAccountOwner() + ", Balance = " + getBalance() + 
				", Routing Number = " + getRoutingNumber() + ", Account Number = " + getAccountNumber();
	}
}
