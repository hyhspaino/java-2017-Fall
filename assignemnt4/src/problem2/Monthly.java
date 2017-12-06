
package problem2;

/**
 * subclass extends by appointment,work for monthly appointment
 * 
 * @author hyh
 */
public class Monthly extends Appointment {
	/**
	 * constructor with initial description and date,call superclass constructor
	 * 
	 * @param desc
	 *            description
	 * @param d
	 *            date
	 */
	public Monthly(String desc, Date d) {
		super(desc, d);
	}

	/**
	 * check a monthly appointment
	 */
	public boolean occursOn(Date d) {
		if (getDate().getDay() == d.getDay() && getDate().getyear() == d.getyear()) {
			return true;
		}
		return false;
	}
}
