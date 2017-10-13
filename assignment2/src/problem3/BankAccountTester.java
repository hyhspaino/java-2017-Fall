package problem3;

/**
 * A class to test the BankAccount class.
 */
public class BankAccountTester {
	/**
	 * Tests the methods of the BankAccount class.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		BankAccount harrysChecking = new BankAccount();
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		harrysChecking.new_month();

		System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 11950");
		
		harrysChecking.new_month();

		harrysChecking.deposit(50);
		harrysChecking.withdraw(1000);
		System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 11000");
	}
}
