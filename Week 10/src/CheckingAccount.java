/**
 *
 * @author Nicholas Cercos
 *
 */
public class CheckingAccount extends BankAccount {

	private final int maxWithdrawAmount;

	public CheckingAccount(int maxWithdrawAmount) {
		this.maxWithdrawAmount = maxWithdrawAmount;
	}

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount(100);
		acct.deposit(200);
		acct.withdraw(50);
		acct.withdraw(101);
		System.out.println();
		System.out.println(acct);
	}

	@Override
	public void withdraw(double amount) {
		if(amount > maxWithdrawAmount)
			System.out.println("Transaction unsuccessful, you cannot withdraw more than $" + maxWithdrawAmount);
		else super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "Type: Checking, " + super.toString();
	}
}
