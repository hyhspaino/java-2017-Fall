package problem1;

public class ComboLockTester {
	public static void main(String[] args)
	{
		ComboLock lock=new ComboLock(33,33,33);
		lock.turnRight(66);
		System.out.println("!");
		lock.turnRight(12);
		System.out.println("!!");
		lock.turnRight(33);
		System.out.println("!!!");
		lock.turnLeft(33);
		lock.turnLeft(66);
		lock.turnLeft(12);
		lock.turnLeft(33);
		lock.turnRight(33);
		lock.turnRight(33);
		System.out.println(lock.open());
	}

}
