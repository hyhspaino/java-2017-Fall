package problem3;

public class DefaultFormatter implements NumberFormatter {
	public String format(int n) {
		Integer m=n;
		return m.toString();
	}
}
