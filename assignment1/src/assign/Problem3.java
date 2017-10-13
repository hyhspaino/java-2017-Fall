
//this class can compute and print the sum and multiplication of the first five negative integers
package assign;//Declaration of the package

public class Problem3 {//Declaration of a class 
public static void main (String [] args)//Declaration of a method(this is a main method)
{   int sum=0, multiplication=1;//Initialize the variable
	for(int i=-1;i>-6; i--)// for loop   
		// i from -1 to -5
	{
		sum+=i; // get the result of sum
		multiplication*=i;// get the result of multiplication
	}
	System.out.println("The sum of the first five negative integers is "  +sum);
	// print the sum 
	System.out.print("The multiplication the first five negative integers is " +multiplication);
	// print the multiplication
	}
}
