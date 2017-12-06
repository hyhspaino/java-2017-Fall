package problem1;

/**
 * The class create a Combo Lock with 3 secret
 * 
 * @author hyh
 *
 */
public class ComboLock {

	private int secret1;
	private int secret2;
	private int secret3;
	private int dial;
	private int step;

	/**
	 * Constructs a combo lock
	 * 
	 * @param secret1
	 *            1st secret
	 * @param secret2
	 *            2nd secret
	 * @param secret3
	 *            3rd secret
	 */
	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
		dial = 0;
		step = 0;

	}

	/**
	 * reset dial =0
	 */
	public void reset() {
		dial = 0;
	}

	/**
	 * scroll the dial by input number
	 * 
	 * @param number
	 *            scroll number
	 */
	public void scroll(int number) {
		dial += number;
		if (dial > 39) {
			dial = dial % 39;

		} else if (dial < 0) {

			dial %= 39;
			dial += 39;
		}

	}

	/**
	 * scroll the dial to left
	 * 
	 * @param number
	 *            scroll number
	 */
	public void turnLeft(int number) {
		this.scroll(-number);
		if (step == 1) {
			if (shouldUnlock(secret2) == true) {
				System.out.println("Secret 2 unlocked");
			} else
				System.out.println("fail to unlocked secret 2");
		}
	}

	/**
	 * check the lock status
	 * 
	 * @return the status of lock
	 */
	public boolean open() {

		return step == 3;

	}

	/**
	 * scroll the dial to left
	 * 
	 * @param number
	 *            scroll number
	 */
	public void turnRight(int number) {
		this.scroll(number);
		if (step == 0) {
			if (shouldUnlock(secret1) == true) {
				System.out.println("Secret 1 unlocked");
			} else
				System.out.println("fail to unlock secret 1");
		}
		if (step == 2) {
			if (shouldUnlock(secret3) == true) {
				System.out.println("Combo lock unlocked");
			} else
				System.out.println("fail to unlock secret 3");
		}

	}

	/**
	 * check the dial = secret
	 * 
	 * @param secret
	 *            the secret
	 * 
	 */
	public boolean shouldUnlock(int secret) {
		if (this.dial == secret) {
			step++;
			return true;
		} else {
			return false;
		}
	}
}
