package problem3;



public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		Integer m = n;
		String s = m.toString();
<<<<<<< HEAD
		char[] arr = s.toCharArray();
		int len = arr.length;
		len %= len + len;
		char[] array = new char[len];
=======
		String reversS = new StringBuilder(s).reverse().toString();
		char[] arr = reversS.toCharArray();
		if (arr.length<=3) 
			return s;
		
		
		int len = arr.length ;
		int dot = len /3;
		int finallenght = len+dot;
		char[] array = new char[finallenght];
>>>>>>> efe65d8456fe44daea6c9cd53c797c2001e08bfb
		int temp = 0;
	int i = 0;
	while (i<arr.length ) {
			if ((temp) % 3 == 0 && (temp) !=0 ) {
				array[temp] = ',';
				temp++;
				continue;
			}
			array[temp] = arr[i];
			temp++;
			i++;
		}
<<<<<<< HEAD
//		for(int i =0; i<array.length;i++)
//			System.out.println(array[i]);
		return array.toString();
=======
	
		
		return new StringBuilder(String.valueOf(array)).reverse().toString();
>>>>>>> efe65d8456fe44daea6c9cd53c797c2001e08bfb
	}

}
