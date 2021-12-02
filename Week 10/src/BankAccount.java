/**
 * 
 * @author Nicholas Cercos
 *
 */
public class BankAccount {
	
	private final int number;
	private double balance;
	private static int numberOfAccounts = 1;

	public BankAccount() {
		number = numberOfAccounts++;
	}

	public int getNumber() {
		return number;
	}

	public void deposit(double amount) {
		if(amount > 0.0) {
			balance += amount;
			displayMessage('d', true, amount);
		} else displayMessage('d', false, amount);
	}

	public void withdraw(double amount) {
		if((balance - amount) >= 0.0) {
			balance -= amount;
			displayMessage('w', true, amount);
		} else displayMessage('w', false, amount);
	}

	@Override
	public String toString() {
		return "Account #" + number + ", Balance: $" + balance;
	}

	public void displayMessage(char type, boolean state, double amount) {
		String messageSuccess = "";
		String messageFail = "";

		if(type == 'd') {
			messageSuccess = " has been deposited to";
			messageFail = "invalid amount.";
		} else if(type == 'w') {
			messageSuccess = " has been withdrawn from";
			messageFail = "not enough balance.";
		}

		if(state)System.out.println("Transaction successful, $" + amount + messageSuccess + " account #" + number + "\nNew Balance: " + balance);
		else System.out.println("Transaction unsuccessful, " + messageFail);
	}

}
