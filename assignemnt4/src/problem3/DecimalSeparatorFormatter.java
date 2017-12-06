package problem3;



public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		Integer m = n;
		String s = m.toString();
		char[] arr = s.toCharArray();
		int len = arr.length;
		len %= len + len;
		char[] array = new char[len];
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 3 == 0 && i != 0) {
				array[i] = ',';
				break;
			}
			array[i] = arr[temp];
			temp++;
		}
//		for(int i =0; i<array.length;i++)
//			System.out.println(array[i]);
		return array.toString();
	}

}
