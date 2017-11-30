package problem3;

public class BaseFormatter implements NumberFormatter{
	int base;
	int border;
	public String format(int n) {
		int[] arr=transform(n);
		char[] result=new char[border];
		for(int i=border;i>=0;i++)
		{
			if(arr[i]>9)
			result[i]=(char)(arr[i]+55);
			else
				result[i]=(char)arr[i];
		}
		return result.toString();
	}
	 public int[] transform(int num){  
	        
	        int array[]=new int[100];  
	         border=0;  
	        while(num!=0){
	            int remainder=num%base;  
	            num=num/base;  
	            array[border]=remainder;
	            border++;  
	        }  
	        return array;  
	  
	    }  
	 public BaseFormatter(int base) {
		 this.base=base;
	 }
}
