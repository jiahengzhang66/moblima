package moblima;

public class CinemaSeat {
	private int seatID;
	private boolean assigned = false;
	private double movieGoersID = 0;


	private CinemaSeat(int seatID) {}
	
	private int getSeatID() {
		return seatID;
	}
	
	private double getCustomerID( ) {
		return movieGoersID;
	}
	
	private boolean isOccupied() {
		return assigned;
	}
	
	private void assign(int cust_id) {
		assigned = true;
		movieGoersID = cust_id;
	}
	
	private void unAssign() {
		assigned = false;
		movieGoersID = 0;
	}
	
	
}

