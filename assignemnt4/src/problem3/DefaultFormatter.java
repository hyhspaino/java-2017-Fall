package problem3;

/**
 * DefaultFormatter class implements NumberFormatter
 * 
 * @author hyh
 *
 */
public class DefaultFormatter implements NumberFormatter {
	/**
	 * Give a number by default format
	 */
	public String format(int n) {
		Integer m = n;
		return m.toString();
	}
}
