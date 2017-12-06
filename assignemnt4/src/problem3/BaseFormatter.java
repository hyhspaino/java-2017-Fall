package problem3;

/**
 * BaseFormatter class implements NumberFormatter with base
 * 
 * @author hyh
 *
 */
public class BaseFormatter implements NumberFormatter {
	int base;
	int border;

	/**
	 * output a base format number by string
	 * 
	 * @return the string of base format number
	 */
	public String format(int n) {
		int[] arr = transform(n);
		char[] result = new char[border];
		for (int i = border; i >= 0; i++) {
			if (arr[i] > 9)
				result[i] = (char) (arr[i] + 55);
			else
				result[i] = (char) arr[i];
		}
		return result.toString();
	}

	/**
	 * transfer number format by base
	 * 
	 * @param num
	 *            A number that you want to transfer to base format
	 * @return base format number
	 */
	public int[] transform(int num) {

		int array[] = new int[100];
		border = 0;
		while (num != 0) {
			int remainder = num % base;
			num = num / base;
			array[border] = remainder;
			border++;
		}
		return array;

	}

	/**
	 * constructor with base
	 * 
	 * @param base
	 *            base
	 */
	public BaseFormatter(int base) {
		this.base = base;
	}
}
