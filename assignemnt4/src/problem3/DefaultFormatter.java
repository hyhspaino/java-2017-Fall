package problem3;
/**
 * DefaultFormatter class implements NumberFormatter
 * @author hyh
 *
 */
public class DefaultFormatter implements NumberFormatter {
	/**
	 * 
	 */
	public String format(int n) {
		Integer m=n;
		return m.toString();
	}
}
