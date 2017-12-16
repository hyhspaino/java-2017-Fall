package problem3;

/**
 * BaseFormatter class implements NumberFormatter
 * 
 * @author hyh
 *
 */
public class BaseFormatter implements NumberFormatter {
	int base;

	public String format(int n) {

		if (n < 0) {
			n = -n;
		}
		this.transform(n, base);

		return "";
	}

	public BaseFormatter(int n) {
		this.base = n;
	}

	/**
	 * transform one number to others format
	 * 
	 * @param num
	 *            the decimal number of the input
	 * @param n
	 *            the number to be converted
	 */
	public void transform(int num, int n) {

		int array[] = new int[100];
		int location = 0;
		while (num != 0) {
			int remainder = num % n;
			num = num / n;
			array[location] = remainder;
			location++;
		}
		show(array, location - 1);

	}

	/**
	 * show the converted number
	 * 
	 * @param arr
	 *            A array store converted
	 * @param n
	 *            size of array
	 */
	private void show(int[] arr, int n) {

		for (int i = n; i >= 0; i--) {
			if (arr[i] > 9) {
				System.out.print((char) (arr[i] + 55));
			} else
				System.out.print(arr[i] + "");
		}
	}
}
