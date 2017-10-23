package problem3;

import java.util.Scanner;

public class Tic_tac_toe {

	private int[][] checkerboard;
	private static final int PLAY1 = 1;
	private static final int PLAY2 = 2;
	private static final int EMPTY = 0;

	private void init_checkerboard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				checkerboard[i][j] = 0;
	}

	private void play1() {
		boolean enter = false;
		Scanner in = new Scanner(System.in);
		while (enter = false) {
			System.out.println("Please player1 start and enter coordinate[0-2][0-2]");
			System.out.println("x:");
			int x_coordinate = in.nextInt();
			System.out.println("y:");
			int y_coordinate = in.nextInt();

			if (checkerboard[x_coordinate][y_coordinate] == 0 && x_coordinate < 3 && y_coordinate < 3) {
				checkerboard[x_coordinate][y_coordinate] = PLAY1;
				enter = true;
			} else
				System.out.println("Invalid operation.");
		}
		in.close();
	}

	private void play2() {
		boolean enter = false;
		Scanner in = new Scanner(System.in);
		while (enter = false) {
			System.out.println("Please player2 start and enter coordinate[0-2][0-2]");
			System.out.println("x:");
			int x_coordinate = in.nextInt();
			System.out.println("y:");
			int y_coordinate = in.nextInt();

			if (checkerboard[x_coordinate][y_coordinate] == 0 && x_coordinate < 3 && y_coordinate < 3) {
				checkerboard[x_coordinate][y_coordinate] = PLAY2;
				enter = true;
			} else
				System.out.println("Invalid operation.");
		}
		in.close();
	}

	private String check_win();

	public void print_checkerboard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (checkerboard[i][j] == 1) {
					System.out.print("|");
					System.out.print("X");
					System.out.print("|");
				} else if (checkerboard[i][j] == 2) {
					System.out.print("|");
					System.out.print("O");
					System.out.print("|");
				} else {
					System.out.print("|");
					System.out.print(" ");
					System.out.print("|");
				}

			}
			System.out.println();
			System.out.print("-------------");
			System.out.println();
		}
	}

	private boolean check_full()
	{
		int full =9;
		int counter=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(checkerboard[i][j] != 0)
					counter++;	
				}
	}
		if(counter==full)
			return true;
		return false;
}
