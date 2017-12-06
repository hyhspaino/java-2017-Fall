package problem2;
/**
 * a date have month,day and year
 * @author hyh
 *
 */
public class Date {
	private String month;
	private int day;
	private int year;

	/**
	 * constructor with initial day,month and year
	 * 
	 * @param day
	 *            day
	 * @param month
	 *            month
	 * @param year
	 *            year
	 */
	public Date(int day, String month, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	/**
	 * get the month of date
	 * 
	 * @return month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * get the day of date
	 * 
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * get the year of date
	 * 
	 * @return year
	 */
	public int getyear() {
		return year;
	}

	/**
	 * get the string the date
	 */
	public String toString() {
		return day + " " + month + " " + year;
	}
}
