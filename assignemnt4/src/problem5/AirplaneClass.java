package problem5;

public class AirplaneClass {
	protected int rows;
	protected int columns;
	public Seat[][] classSeat;
	protected String className;

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	public String getClassName() {
		return className;
				}

	public AirplaneClass(int rows, int columns, String className) {
		this.rows = rows;
		this.columns = columns;
		this.classSeat = new Seat[rows][];
		 for(int i=0; i<classSeat.length; ++i){
			 classSeat[i]=new Seat[columns];
	       }
		 
		 
		 for(int i=0; i<classSeat.length; ++i){
			 for(int j=0; j<columns; ++j){
			 classSeat[i][j]=new Seat(null,0,null);
			 }
	       }
		this.className = className;
	}

	public void FillTheSeatNumber(int first) {
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				classSeat[i][j].setSeatNumber(first++);
	}

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