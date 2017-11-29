package problem5;

public class EconomyClass extends AirplaneClass{
	public EconomyClass(int rows, int columns, String className) {
		super(rows, columns, className);
		seatPosition();
	}

	private void seatPosition() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				if (j == 0 || j == 5)
					classSeat[i][j].setPosition("window");
				else if(j==2||j==3)
					classSeat[i][j].setPosition("aisle");
				else
					classSeat[i][j].setPosition("center");
			}
		}
}
}
