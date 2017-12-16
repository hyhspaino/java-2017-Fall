package problem5;

/**
 * subclass extend superclass AirplaneClass
 * 
 * @author hyh
 *
 */
public class EconomyClass extends AirplaneClass {
	/**
	 * constructor
	 * 
	 * @param rows
	 *            rows set how many rows in this class
	 * @param columnscolumns
	 *            set how many columns in the plane
	 * @param classNameclassName
	 *            set class name
	 */
	public EconomyClass(int rows, int columns, String className) {
		super(rows, columns, className);
		seatPosition();
	}

	/**
	 * set seat preference
	 */
	private void seatPosition() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getColumns(); j++) {
				if (j == 0 || j == 5)
					classSeat[i][j].setPosition("window");
				else if (j == 2 || j == 3)
					classSeat[i][j].setPosition("aisle");
				else
					classSeat[i][j].setPosition("center");
			}
		}
	}
}
