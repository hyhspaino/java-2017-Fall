package problem1;

public class ComboLock {

	private int secret1;
	private int secret2;
	private int secret3;
	private int dial;
	private int step;

	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
		dial=0;
		step = 0;

	}

	public void reset() {
		dial = 0;
	}

	public void scroll(int number) {
		dial +=number;
		if (dial  > 39) {
			dial=dial%39;
			 
		} else if (dial  < 0) {
			
			dial%=39;
			dial+=39;
		} 

	}

	public void turnLeft(int number) {
		this.scroll(-number);
         if(step==1) {
		if (shouldUnlock(secret2) == true) {
			System.out.println("Secret 2 unlocked");
		} else
			System.out.println("fail to unlocked secret 2");
	}
	}


	public boolean open() {
		
		return step == 3;
		
	}

	public void turnRight(int number) {
		this.scroll(number);
		if(step==0) {
		if (shouldUnlock(secret1) == true) {
			System.out.println("Secret 1 unlocked");}
		else
			System.out.println("fail to unlock secret 1");}
		if (step==2) {
			if (shouldUnlock(secret3) == true) {
				System.out.println("Combo lock unlocked");}
			else
				System.out.println("fail to unlock secret 3");
		} 

	}

	public boolean shouldUnlock(int secret) {
		if (this.dial == secret) {
			step++;
			return true;
		} else {
			return false;
		}
	}
}
