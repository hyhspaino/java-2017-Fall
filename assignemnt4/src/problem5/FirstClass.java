package problem5;

/**
 * subclass extend superclass AirplaneClass
 * 
 * @author hyh
 *
 */
public class FirstClass extends AirplaneClass {
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
	public FirstClass(int rows, int columns, String className) {
		super(rows, columns, className);
		seatPosition();
	}

	/**
	 * set seat preference
	 */
	private void seatPosition() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < super.getColumns(); j++) {
				if (j == 0 || j == 3)

					this.classSeat[i][j].setPosition("window");
				else
					this.classSeat[i][j].setPosition("aisle");
			}
		}
	}
}
