package problem5;

/**
 * the properties of a seat
 * 
 * @author hyh
 *
 */
public class Seat {
	private String status = null;
	private int seatNumber;
	private String position = null;

	/**
	 * constructor
	 * 
	 * @param s
	 *            status
	 * @param sn
	 *            seat number
	 * @param p
	 *            position
	 */
	public Seat(String s, int sn, String p) {
		this.status = s;
		this.seatNumber = sn;
		this.position = p;
	}

	/**
	 * get seat status
	 * 
	 * @return seat status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * get seat number
	 * 
	 * @return seat number
	 */
	public int getSeatnumber() {
		return seatNumber;
	}

	/**
	 * get seat position
	 * 
	 * @return seat position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * set seat status
	 * 
	 * @param s
	 *            seat status
	 */
	public void setStatus(String s) {
		this.status = s;
	}

	/**
	 * set seat number
	 * 
	 * @param s
	 *            seat number
	 */
	public void setSeatNumber(int sn) {
		this.seatNumber = sn;
	}

	/**
	 * set seat position
	 * 
	 * @param s
	 *            seat position
	 */
	public void setPosition(String p) {
		this.position = p;
	}
}
