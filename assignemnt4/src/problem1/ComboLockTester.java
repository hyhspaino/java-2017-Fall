package problem1;

/**
 * A class toTest combo lock
 * 
 * @author hyh
 *
 */
public class ComboLockTester {

	public static void main(String[] args) {
		ComboLock lock = new ComboLock(33, 33, 33);
		// try 1st secret
		lock.turnRight(33);
		// try 2nd secret
		lock.turnLeft(33);
		lock.turnLeft(6);
		// try 3rd secret
		lock.turnRight(6);
		lock.turnRight(33);

		System.out.println(lock.open());
	}

}
