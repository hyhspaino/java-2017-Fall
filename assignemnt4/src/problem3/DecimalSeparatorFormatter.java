package problem3;

public class DecimalSeparatorFormatter implements NumberFormatter {
	public String format(int n) {
		Integer m = n;
		String s = m.toString();
		char[] arr = s.toCharArray();
		if (arr.length<=3) 
			return s;
		
		
		int len = arr.length ;
		int dot = (len-1) /3;
		int finallenght = len+dot;
		char[] array = new char[finallenght];
	
	int counter =0;
	int slow = array.length -1;
	int fast = arr.length -1;
	
while (slow>=0) {
	if (counter ==3) {
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


// public class DecimalSeparatorFormatter implements NumberFormatter {
// 	public String format(int n) {
// 		Integer m = n;
// 		String s = m.toString();
// 		String reversS = new StringBuilder(s).reverse().toString();
// 		char[] arr = reversS.toCharArray();
// 		if (arr.length<=3) 
// 			return s;
		
		
// 		int len = arr.length ;
// 		int dot = len /3;
// 		int finallenght = len+dot;
// 		char[] array = new char[finallenght];
// 		int temp = 0;
// 	int i = 0;
// 	while (i<arr.length ) {
// 			if ((temp) % 3 == 0 && (temp) !=0 ) {
// 				array[temp] = ',';
// 				temp++;
// 				continue;
// 			}
// 			array[temp] = arr[i];
// 			temp++;
// 			i++;
// 		}
	
		
// 		return new StringBuilder(String.valueOf(array)).reverse().toString();
// 	}

// }
