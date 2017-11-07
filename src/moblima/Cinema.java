package moblima;
public class Cinema {
	private CinemaSeat[][] seat;
	private int numEmptySeat;
	private String type;
	private float discount;
	private int cinemaId;
	
	public Cinema() {}
	
	public int numEmptySeats() {
		return numEmptySeat;
	}
	
	public void showEmptySeats() {}
	
	public void showAssignedseats(boolean bySeatID) {}
	
	public void assignSeat(int seatID, int cust_id) {}
	
	public void unAssignSeat(int seatID) {}
	
	public void unassignAllSeats() {}
	
}
