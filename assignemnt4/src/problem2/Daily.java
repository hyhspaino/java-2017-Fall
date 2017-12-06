package problem2;

/**
 * subclass extends by appointment,work for daily appointment
 * 
 * @author hyh
 *
 */
public class Daily extends Appointment {
	/**
	 * constructor with initial description and date,call superclass constructor
	 * 
	 * @param desc
	 *            description
	 * @param d
	 *            date
	 */
	public Daily(String desc, Date d) {
		super(desc, d);
	}

	/**
	 * check a daily appointment
	 */
	public boolean occursOn(Date date) {
		return true;
	}

}
