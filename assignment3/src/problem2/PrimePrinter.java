package problem2;

import java.util.Scanner;

public class PrimePrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter upper limit: ");
		int limit = in.nextInt();
		// Complete this part
		
		for(int i = 0;i<=limit;i++)
			if(true==PrimeGenerator.isPrime(i))
				System.out.println(i);
		in.close();
	}
}
