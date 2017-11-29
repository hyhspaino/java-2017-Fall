package problem5;

public class Seat {
	private String status=null;
	private int seatNumber;
	private String position=null;

	public Seat(String s, int sn, String p) {
		this.status = s;
		this.seatNumber = sn;
		this.position = p;
	}

	public String getStatus() {
		return status;
	}

	public int getSeatnumber() {
		return seatNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setStatus(String s) {
		this.status = s;
	}

	public void setSeatNumber(int sn) {
		this.seatNumber = sn;
	}

	public void setPosition(String p) {
		this.position = p;
	}
}
