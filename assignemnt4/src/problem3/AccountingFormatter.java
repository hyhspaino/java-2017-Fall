package problem3;

public class AccountingFormatter implements NumberFormatter{
	
	public String format(int n) {
	
		Integer m = n;
		if (m < 0) {
			m = -m;
			String s = "(" + m.toString() + ")";
			return s;
		}
		return m.toString();
	}
}
