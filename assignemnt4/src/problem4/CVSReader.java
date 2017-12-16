package problem4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CVSReader {
	String csvFile;
	ArrayList<String> strArray = new ArrayList<String>();

	public CVSReader(String path) {

		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null) {
				this.strArray.add(line);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) throws IOException {
//
//		String csvFile = "./src/test.csv";
//		CVSReader newcsv = new CVSReader(csvFile);
//		int number = newcsv.numberOfRows();
//		int numberOfFields = newcsv.numberOfFields();
//		String field = newcsv.field(1, 1);
//		System.out.println(number + "" + numberOfFields + "");
//
//		System.out.println("" + field);
//	}

	public int numberOfRows() throws IOException {
		return strArray.size();
	}

	public int numberOfFields() {
		String line = strArray.get(0);
		String cvsSplitBy = ",";

		String[] country = line.split(cvsSplitBy);

		//		System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");
		return country.length;

	}

	public String field(int row, int column) {

		String line = strArray.get(row - 1);

		String cvsSplitBy = ",";

		String[] country = line.split(cvsSplitBy);

		//		System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");
		return country[column - 1];

	}

}
