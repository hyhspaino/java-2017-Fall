package problem3;

import java.util.Scanner;

public class Tic_tac_toe {

	private int[][] checkerboard=new int[3][3] ;
	private static final int PLAY1 = 1;
	private static final int PLAY2 = 2;
	private static final int EMPTY = 0;
	private boolean turn;
	private boolean win;

	private void init_checkerboard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				checkerboard[i][j] = 0;
	}

	public void play() {
		init_checkerboard();
		boolean enter = false;
		boolean full = check_full();
		Scanner in = new Scanner(System.in);
		int y_coordinate = 0;
		int x_coordinate = 0;
		while (win == false && full == false) {
			while (enter == false) {
				System.out.println("Please player start and enter coordinate[0-2][0-2]");
				System.out.println("x:");
				x_coordinate = in.nextInt();
				System.out.println("y:");
				y_coordinate = in.nextInt();
				if (checkerboard[x_coordinate][y_coordinate] == 0 && x_coordinate < 3 && y_coordinate < 3
						&& turn == true) {
					checkerboard[x_coordinate][y_coordinate] = PLAY1;
					enter = true;
					turn = false;
				} else if (checkerboard[x_coordinate][y_coordinate] == 0 && x_coordinate < 3 && y_coordinate < 3
						&& turn == false) {
					checkerboard[x_coordinate][y_coordinate] = PLAY2;
					enter = true;
					turn = true;
				} else
					System.out.println("Invalid operation.");
			}
			enter=false;
			print_checkerboard();
			win = check_win(x_coordinate, y_coordinate);
			full = check_full();
		}
		in.close();
		System.out.println("Game over!");
		print_checkerboard();
	}

	private boolean check_win(int x, int y) {
		return ((checkerboard[x][0] == checkerboard[x][y] && checkerboard[x][1] == checkerboard[x][y]
				&& checkerboard[x][2] == checkerboard[x][y])
				|| (checkerboard[0][y] == checkerboard[x][y] && checkerboard[1][y] == checkerboard[x][y]
						&& checkerboard[2][y] == checkerboard[x][y])
				|| (checkerboard[0][0] == checkerboard[x][y] && checkerboard[1][1] == checkerboard[x][y]
						&& checkerboard[2][2] == checkerboard[x][y])
				|| (checkerboard[2][0] == checkerboard[x][y] && checkerboard[1][1] == checkerboard[x][y]
						&& checkerboard[0][2] == checkerboard[x][y]));

	}

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

	private boolean check_full() {
		int full = 9;
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (checkerboard[i][j] != 0)
					counter++;
			}
		}
		if (counter == full)
			return true;
		return false;
	}
}
