package problem2;

/**
 * subclass extends by appointment,work for one time appointment
 * 
 * @author hyh
 *
 */
public class Onetime extends Appointment {
	/**
	 * constructor with initial description and date,call superclass constructor
	 * 
	 * @param desc
	 *            description
	 * @param d
	 *            date
	 */
	public Onetime(String desc, Date d) {
		super(desc, d);
	}

	/**
	 * check a one time appointment
	 */
	public boolean occursOn(Date d) {

		if (getDate().getMonth().equalsIgnoreCase(d.getMonth()) && getDate().getDay() == d.getDay()) {
			if (getDate().getyear() == d.getyear()) {
				return true;
			}

		}
		return false;
	}
}
