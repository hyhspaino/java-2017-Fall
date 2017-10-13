package problem2;
/**
 * Microwave control with cooking time ,start button and cooking power
 * @author hyh
 *
 */
public class Microwave_control {
	private static final int INCREASING_TIME = 30;
	private int start_button;
	private int time;
	private int power;
/**
 * Constructs and set the initial time,power and button
 */
	public Microwave_control() {
		start_button = 0;
		time = 0;
		power = 0;
	}
	/**
	 * Constructs and set the initial time,power and button
	 * @param star close=0; others is open
	 * @param time  cooking time
	 * @param power  only can read 1 or 2,if the input is not 1, this method will set the power is 2 
	 */
	public Microwave_control(int star,int time,int power) {
		start_button = star;
		this.time =time;
		this.power =power;
	}
/**
 * start cooking
 */
	public void start() {
		start_button=1;
		show_status();

	}
/**
 * reset the all data of Microwave
 */
	public void reset() {
		this.start_button = 0;
		//System.out.println("reseting:"+this.start_button);
		this.power = 0;
		time = 0;
	}
/**
 * add cooking time, only can add 30s
 * @return the new cooking time
 */
	public int add_cooking_time() {
		return (time += INCREASING_TIME);
	}
/**
 * choose cooking power
 * @param p if not 1 , the method will set the power is 2
 */
	public void cooking_power(int p) {
		if (p == 1)
			power = p;
		else
			power = 2;
	}
/**
 * show the all status for Microwave
 */
	public void show_status() {
		//System.out.println("status:"+this.start_button);
		if (this.time == 0)
			System.out.println("Please set cooking time");
		else {
			System.out.println("Cooking,please wait a monent");
			System.out.println("cooking time is " + time + "s");
			System.out.println("cooking power is " + power);
		}
	}
}
