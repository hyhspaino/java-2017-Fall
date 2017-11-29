package problem2;

public class Onetime extends Appointment {
	
	public Onetime(String desc, Date d) {
		super(desc, d);
	}

	public boolean occursOn(Date d) {
		
			if (getDate().getMonth().equalsIgnoreCase(d.getMonth()) && getDate().getDay() == d.getDay()) {
				if (getDate().getyear() == d.getyear()) {
					return true;
				}
			
			}
			return false;
	}
}
