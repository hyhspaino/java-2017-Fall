package problem1;

public class ComboLockTester {
	public static void main(String[] args)
	{
		ComboLock lock=new ComboLock(11,22,33);
		lock.turnRight(11);
		lock.turnLeft(11);
		lock.turnLeft(22);
		lock.turnRight(22);
		lock.turnRight(33);
		System.out.println(lock.open());
	}

}
