package problem4;

import java.util.Scanner;
/**
 * A class to test the BankAccount class.
 * @author hyh
 *
 */
public class Cashier_tester {
	/**
	 * 
	 *  Tests the methods of the BankAccount class.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter amount due and amount received");
		double amount_due = in.nextDouble();
		double amount_received = in.nextDouble();
		Help_cashier customer = new Help_cashier(amount_due, amount_received);
		customer.result();
		in.close();
	}
}
