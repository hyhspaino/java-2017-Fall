package problem2;
/**
 * A class to test the Microwave.
 * @author hyh
 *
 */
public class Microwave {
	/**
	 * Test the methods of Microwave
	 * @param args not used
	 */
 public static void main (String[] args)
 {
	 Microwave_control mc=new  Microwave_control();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.add_cooking_time();
	 mc.cooking_power(2);
	 mc.start();
	 mc.reset();
	 mc.start();
	 
 }
}
