package problem1;

public class ComboLockTester {
	public static void main(String[] args)
	{
		ComboLock lock=new ComboLock(3,2,3);
		lock.turnRight(42);
		
		lock.turnLeft(1);
		
		lock.turnRight(43);
		 
		
		System.out.println(lock.open());
	}

}
