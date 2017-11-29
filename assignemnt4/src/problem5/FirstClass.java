package problem5;

public class FirstClass extends AirplaneClass {
	public FirstClass(int rows, int columns, String className) {
		super(rows, columns, className);
		seatPosition();
	}

	private void seatPosition() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < super.getColumns(); j++) {
				if (j == 0 || j == 3)
					classSeat[i][j].setPosition("window");
				else
					classSeat[i][j].setPosition("aisle");
			}
		}
	}
}
