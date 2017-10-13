package problem1;

import java.util.Scanner;

/**
 * A class to test the Traffic light.
 * 
 * @author hyh
 *
 */
public class test {
	/**
	 * Test the methods of Traffic light
	 * @param args not used
	 * 				
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a color(yellow,red or green)");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		Traffic_light light2 = new Traffic_light(s1);
		light2.show_traffic_light();
		in.close();
	}
}
