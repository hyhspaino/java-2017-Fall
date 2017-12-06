package problem3;

/**
 * AccountingFormatter class implements NumberFormatter
 * 
 * @author hyh
 *
 */
public class AccountingFormatter implements NumberFormatter {
	/**
	 * Give a account format number
	 * 
	 * @param n
	 *            A number that you want to transfer to account format
	 */
	public String format(int n) {

		Integer m = n;
		if (m < 0) {
			String s = "(" + m.toString() + ")";
			return s;
		}
		return m.toString();
	}
}
