package problem4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CVSReader {
String csvFile;
public CVSReader(String path) {
	csvFile=path;
}


	public static void main(String[] args) {

		String csvFile = "./src/test.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] country = line.split(cvsSplitBy);

				System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public int numberOfRows() throws IOException {
		
		String line = "";
		int counter = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				counter++;
			}
		}
		return counter;
	}

	public int numberOfFields(int row) throws FileNotFoundException, IOException {
		
		String line = "";
		String cvsSplitBy = ",";

		int counter = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] temp = line.split(cvsSplitBy);

				counter++;

				if (counter == row)
					return temp.length;
			}
		}
		return counter;

	}

	public String field(int row, int column) throws FileNotFoundException, IOException {

		
		String line = "";
		String cvsSplitBy = ",";
		int counter = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] temp = line.split(cvsSplitBy);
				counter++;
				if (counter == row) {
					return temp[column];
				}
			}

		}
		return cvsSplitBy;

	}
}

