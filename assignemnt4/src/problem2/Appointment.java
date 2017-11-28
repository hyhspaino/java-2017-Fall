package problem2;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Appointment {
	private ArrayList<String> description;
	private ArrayList<Date> date;

	public Appointment(String description, int year, int month, int day) throws ParseException {
		this.description = description;
		DateFormat dateFormatter = new SimpleDateFormat(String.format("yyyy-MM-dd"));
		date.add((Date) dateFormatter.parse(String.format("%d-%d-%d", year, month, day)));

	}

	public boolean occursOn(int year, int month, int day) throws ParseException {
		DateFormat dateFormatter = new SimpleDateFormat(String.format("yyyy-MM-dd"));
		boolean result = false;
		int counter = 0;
		while (result == false && counter <= date.size()) {
			Date checkedDate = (Date) dateFormatter.parse(String.format("%d-%d-%d", year, month, day));
			result=checkedDate.equals(date);
		}
		return result;
	}

	public ArrayList<Date> getAllAppointment() {
		return date;
		
	}

	
}
