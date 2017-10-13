package problem4;
/**
 * help cashier to get change
 * @author hyh
 *
 */
public class Help_cashier {
	private int amount_due;
	private int amount_received;
	private int change;
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
/**
 * Constructs and initial all data
 * 
 * @param amountDue amount due for customer
 * @param amountRreceived amount received from customer
 */
	public Help_cashier(double amountDue, double amountRreceived) {
		amount_due = (int) (amountDue * 100);
		amount_received = (int) (amountRreceived * 100);
		total_change();
		give_coin();
		give_cash();
	}
/**
 * get total change *100
 */
	private void total_change() {
		change = amount_received - amount_due;
	}
/**
 *  get total coin(less than 1 dollar)
 */
	private void give_coin() {
		int temp = change % 100;
		quarters = temp / 25;
		temp = temp % 25;
		dimes = temp / 10;
		temp = temp % 10;
		nickels = temp / 5;
		temp = temp % 5;
		pennies = temp;
	}
/**
 * get total cash(more than 1 dollar)
 */
	private void give_cash() {
		dollars = change / 100;
	}
/**
 * print the result to cashier
 */
	public void result() {
		System.out.println("you need return " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes "
				+ nickels + " nickels " + pennies + " pennies ");
	}
}
