package Problem4;

import java.util.Scanner;

public class Map {
	private int x;
	private int y;
	private double array[][];
	private double flood_height;

	public Map(int x, int y) {
		double[][] array = new double[x][y];
		this.array = array;
		this.x = x;
		this.y = y;
		flood_height = 0;
	}

	public void set_height() {
		System.out.println("Please enter the height of all point");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				array[i][j] = in.nextDouble();
		in.close();
	}

	public void set_flood_height(double flood_height) {
		this.flood_height = flood_height;
	}

	public void print_flood_map() {
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				if (array[i][j] < flood_height) {
					System.out.print("*");
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void get_lowest_point() {
		int x = 0;
		int y = 0;
		double height = this.array[0][0];
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				if (array[i][j] < height) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("The lowest_point is " + x + " " + y);
	}

	public void get_highest_point() {
		int x = 0;
		int y = 0;
		double height = this.array[0][0];
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				if (array[i][j] > height) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("The heighest point is " + x + " " + y);
	}

}
