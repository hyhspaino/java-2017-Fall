package problem3;

/**
 * DecimalSeparatorFormatter class implements NumberFormatter
 * 
 * @author hyh
 *
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
	/**
	 * Give a Decimal Separator format number
	 * 
	 * @return Decimal Separator format number
	 */
	public String format(int n) {
		Integer m = n;
		String s = m.toString();
		char[] arr = s.toCharArray();
		if (arr.length <= 3)
			return s;

		int len = arr.length;
		int dot = (len - 1) / 3;
		int finallenght = len + dot;
		char[] array = new char[finallenght];

		int counter = 0;
		int slow = array.length - 1;
		int fast = arr.length - 1;

		while (slow >= 0) {
			if (counter == 3) {
				array[slow--] = ',';
				counter = 0;
			} else {
				array[slow--] = arr[fast--];
				counter++;
			}
		}

		return new String(array);

	}

}


