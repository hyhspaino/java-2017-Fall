package problem5;
/**
 * superclass airplane 
 * @author hyh
 *
 */
public class AirplaneClass {
	protected int rows;
	protected int columns;
	public Seat[][] classSeat;
	protected String className;

	/**
	 * get how many rows in the plane
	 * 
	 * @return rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * get how many columns in the plane
	 * 
	 * @return column
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * get the class name
	 * 
	 * @return class name
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * constructor
	 * 
	 * @param rows
	 *            set how many rows in the plane
	 * @param columns
	 *            set how many columns in the plane
	 * @param className
	 *            set class name
	 */
	public AirplaneClass(int rows, int columns, String className) {
		this.rows = rows;
		this.columns = columns;
		this.classSeat = new Seat[rows][columns];

		for (int i = 0; i < classSeat.length; ++i) {
			for (int j = 0; j < columns; ++j) {
				classSeat[i][j] = new Seat(null, 0, null);
			}
		}
		this.className = className;
	}

	/**
	 * input seat number
	 * 
	 * @param first
	 *            first seat number in one class
	 */
	public void FillTheSeatNumber(int first) {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				classSeat[i][j].setSeatNumber(first++);
	}

	/**
	 * find a seat
	 * 
	 * @param position
	 *            the position of the seat
	 * @return seat number or -1
	 */
	public int findSeat(String position) {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				if (classSeat[i][j].getPosition().equals(position)) {
					if (classSeat[i][j].getStatus() == (null)) {
						classSeat[i][j].setStatus("booked");
						return classSeat[i][j].getSeatnumber();
					}
				}
		return -1;
	}
}