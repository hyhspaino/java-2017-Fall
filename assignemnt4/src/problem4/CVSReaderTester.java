package problem4;

import java.io.IOException;

public class CVSReaderTester {
	public static void main(String[] args) throws IOException {

		String csvFile = "./src/test.csv";
		CVSReader newcsv = new CVSReader(csvFile);
		int number = newcsv.numberOfRows();
		int numberOfFields = newcsv.numberOfFields();
		String field = newcsv.field(1, 1);
		System.out.println(number + "rows" + numberOfFields + "colums");

		System.out.println("field" + field);
	}
}
