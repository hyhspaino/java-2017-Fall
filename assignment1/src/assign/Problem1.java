//this class can do a calculation about the account  balance
//the initial balance is $1,000 and earns 5% interest per year.
package assign;
//Declaration of the package

public class Problem1 {
	//Declaration of a class 
	
	public static  void main(String[] args)// Declaration of a method(this is a main method)
{
	double initial_balance=1000.0;// Initialize the variable
	System.out.println("First year balance is "+(initial_balance * 1.05));
	// print the first year balance in the screen
	System.out.println("Second year balance is "+(initial_balance* 1.05*1.05));
	// print the second year balance in the screen
	System.out.println("Third year balance is "+(initial_balance * 1.05*1.05*1.05));
	// print the third year balance in the screen
	}

}
