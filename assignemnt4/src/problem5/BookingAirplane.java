package problem5;

import java.util.Scanner;

public class BookingAirplane {
	public static void main(String[] arg) {
		AirplaneClass first = new FirstClass(5, 4, "First Class");
		first.FillTheSeatNumber(1);
		AirplaneClass economy = new EconomyClass(15, 6, "Economy Class");
		economy.FillTheSeatNumber(21);

		System.out.println("Please enter the number of passengers travelling ");
		Scanner in = new Scanner(System.in);
		int passengers = in.nextInt();
		while (passengers > 0) {
			System.out.println("Please enter Airplane Class (First Class or Economy Class)");
			String c = in.nextLine();
			if (c.equals("First Class")) {
				System.out.println("the seating preference (aisle or window in first class ).");
				String position = in.nextLine();
				int seat = first.findSeat(position);
				if (seat != -1) {
					System.out.println("Your seat number is " + seat);
				} else
					System.out.println("The operation failed");
			} else {
				System.out.println("the seating preference (aisle, center, or window in economy).");
				String position = in.nextLine();
				int seat = first.findSeat(position);
				if (seat != -1) {
					System.out.println("Your seat number is " + seat);
				} else
					System.out.println("The operation failed");
				passengers--;
			}
		}
	}

}
