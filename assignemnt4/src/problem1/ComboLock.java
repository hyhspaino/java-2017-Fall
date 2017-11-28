package problem1;

public class ComboLock {

	private int secret1;
	private int secret2;
	private int secret3;
	private int dial;
    
	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	
	}

	public void reset() {
		dial = 0;
	}

	public void scroll(int number) { 
	        if (dial + number > 39) {
	            if (number >= 39) {
	            	dial += number;
	            	while(dial>=39)
	                dial-=39;}
	            else
	            	dial += number - 39; }
	        else if (dial + number < 0) 
	        {
	           dial=(dial+number)*-1; 
	           while(dial>=39)
	                dial-=39;
	        }
	        else  
	            dial += number; 
	         	    
	        }

	public void turnLeft(int number) {
		this.scroll(-number);
		
			if (shouldUnlock(secret2) == true) {
				System.out.println("Secret 2 unlocked");
			}
		}

 
	public void turnRight(int number) {
		this.scroll(number);
		if (shouldUnlock(secret1) == true) {
			System.out.println("Secret 1 unlocked");
			if (shouldUnlock(secret2) == true) {
				if (shouldUnlock(secret3) == true) {
					System.out.println("Combo lock unlocked");
				}
			}
		}
	}

	public boolean shouldUnlock(int secret) {
		if (this.dial == secret) {
			secret = -1;
			return true;
		} else {
			return false;
		}
	}
}}
