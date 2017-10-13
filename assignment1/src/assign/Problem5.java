/*
 * compute the following mathematical operations
 * formula1 is s=s0+v0+1/2gt^2 g is given g=9.8
 * formula2 is G=4pi^2a^3/p^2(m1+m2) pi is given pi = 3.14
 * Other variables are entered by the user
 */

package assign;
//Declaration of the package

import java.util.Scanner;
import java.lang.Math;
// import class
 
public class Problem5 {//Declaration of a class 
	static double g=9.8;
	static double pi=3.14;
	public static void main(String [] args)// Declaration of a method(this is a main method)
	{
		System.out.println("Choose formula 1 (s=s0+v0+1/2gt^2)  typing 1, choose formula 2 (G=4pi^2a^3/p^2(m1+m2)) typing 2.");
		Scanner scanner =new Scanner(System.in);// declaring new Scanner called scanner
		int choice=scanner.nextInt();// Reading Data From Console
		if(choice==1)// user choose s=s0+v0+1/2gt^2 
		{
			System.out.println("you choose formula 1 , g=9.8");
			System.out.println("s0? v0? t?");
			double s0=scanner.nextDouble();// get s0
			double v0=scanner.nextDouble();// get v0
			double t=scanner.nextDouble();// get t
//			System.out.println(a);
//			String a=scanner.nextLine();
//			double s0=Double.valueOf(a);
//			String b=scanner.nextLine();
//			double v0=Double.valueOf(b);
//			String c=scanner.nextLine();
//			double t=Double.valueOf(c);
				
			System.out.println(formula1(s0,v0,t));// call method(formula1) and print result
		}
		else	
		{
			System.out.println("you choose formula 2 , pi=9.8");
			System.out.println("a? p? m1? m2?");
			double a=scanner.nextDouble();// get a
			double p=scanner.nextDouble();// get p
			double m1=scanner.nextDouble();//get m1
			double m2=scanner.nextDouble();//get m2
//			String a1=scanner.nextLine();
//			String b=scanner.nextLine();
//			String c=scanner.nextLine();
//			String d=scanner.nextLine();
//			double a=Double.valueOf(a1);
//			double p=Double.valueOf(b);
//			double m1=Double.valueOf(c);
//			double m2=Double.valueOf(d);
			System.out.println(formula2(a,p,m1,m2));// call method(formula2) and print result
		}
		scanner.close();//  // closes the scanner
	}
	private static double formula1(double s0,double v0,double t) // method formula1
	{
			
		return s0+v0+0.5*g*t*t;//compute the result and return it to the main method
	}
	private static double formula2(double a,double p, double m1, double m2) // method formula2
    {
		return 4*Math.pow(pi, 2)*Math.pow(a,3)/(Math.pow(p,2)*(m1+m2));//compute the result and return it to the main method
	}
}
