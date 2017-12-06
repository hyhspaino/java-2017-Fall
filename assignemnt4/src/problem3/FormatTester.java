package problem3;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FormatTester {
	public static void main(String[] arg) throws IOException {
		String pathname = "./src/Tester.txt";
		File filename = new File(pathname); 
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); 
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(reader); 
		String line = "";
		line = br.readLine();
//		while (line != null) {
<<<<<<< HEAD
//			line = br.readLine(); 
=======
		//	line = br.readLine(); 
>>>>>>> efe65d8456fe44daea6c9cd53c797c2001e08bfb
//		}
		String SplitBy = " ";
		String[] temp = line.split(SplitBy);
		Integer[] number = new Integer[temp.length];
<<<<<<< HEAD
		for (int i = 0; i < number.length; i++) 
			number[i] = Integer.parseInt(temp[i]);
=======
		for (int i = 0; i < number.length; i++) {
			if (temp[i].length() ==0) {

				number[i]=null;
				} 
			else{
				
				number[i] = Integer.parseInt(temp[i]);
			}
			
		}
			
>>>>>>> efe65d8456fe44daea6c9cd53c797c2001e08bfb
		AccountingFormatter a1= new AccountingFormatter();
		
		
		
		for (int i = 0; i < number.length; i++)
			System.out.println(a1.format(number[i]));
		
		
//		BaseFormatter a2= new BaseFormatter(8);
//		for (int i = 0; i < number.length; i++)
//			System.out.println(a2.format(number[i]));
//		BaseFormatter a3= new BaseFormatter(2);
//		for (int i = 0; i < number.length; i++)
//			System.out.println(a3.format(number[i]));
		DecimalSeparatorFormatter a4= new DecimalSeparatorFormatter();
		for (int i = 0; i < number.length; i++)
			System.out.println(a4.format(number[i]));
//		DefaultFormatter a5= new DefaultFormatter();
//		for (int i = 0; i < number.length; i++)
//			System.out.println(a5.format(number[i]));
	}
	
}
