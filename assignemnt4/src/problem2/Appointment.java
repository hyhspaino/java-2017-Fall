package problem2;

/**
 * superclass Appointment
 * 
 * @author hyh
 *
 */
public abstract class Appointment {
	private Date date;
	private String description;

	/**
	 * constructor with initial description and date
	 * 
	 * @param desc
	 *            description
	 * @param d
	 *            date
	 */
	public Appointment(String desc, Date d) {
		description = desc;
		date = d;
	}

	/**
	 * get the date of appointment
	 * 
	 * @return the date of appointment
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * get the description of appointment
	 * 
	 * @return the description of appointment
	 */
	public String getdescription() {
		return description;
	}

	/**
	 * the string of appointment(description + date)
	 * 
	 * @return description + date
	 */
	public String toString() {
		return description + date.toString();
	}

	/**
	 * abstract method need overwrite in subclass
	 * 
	 * @param the
	 *            date you want to check appointment
	 * @return
	 */
	public abstract boolean occursOn(Date date);

}
