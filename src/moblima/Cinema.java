package moblima;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cinema {
	private CinemaSeat[] seat;
	private static int numEmptySeat;
	/*private abstract String type;*/
	private float discount;
	private int cinemaId;
	
	public Cinema() throws IOException {
		CinemaSeat[] seat = new CinemaSeat[144];
		BufferedWriter pw = new BufferedWriter(new FileWriter("test.csv"));
    	StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 144; i++)//for each row
    	{
    			seat[i] = new CinemaSeat((i+1));
    			seat[i].setSeatID(i+1);
    			
    	        sb.append(seat[i].getSeatID()+","+seat[i].isAssigned()+","+seat[i].getMovieGoersID()+"\n");

    			}
    			    	        pw.write(sb.toString());
    	        pw.close();
    	        System.out.println("done!");
    	}

	
	public static int numEmptySeats() {
		String[] scinema = null;
		CinemaSeat[] seat = new CinemaSeat[144];
		CinemaController.convertCSV(seat,scinema);	
		numEmptySeat=0;
		for(int i = 0; i < 144; i++){
			if (seat[i].isAssigned() == false)
       					numEmptySeat++;
       		};
       	return numEmptySeat;
    }

	public void showEmptySeats() {
		for(int i = 0; i < 144; i++){
				if (seat[i].isAssigned() == false) {
					System.out.println(seat[i].getSeatID());
					}
			}
		}	
	
	public void showAssignedseats() {
		for(int i = 0; i < 144; i++){
			if (seat[i].isAssigned() == true) {
				System.out.println(seat[i].getSeatID());
				}
		}
	}	

	public void assignSeat(int seatID, int cust_id) {
		int i = seatID-1;
		if (seat[i].isAssigned() == true) {
			System.out.println("Seat already assigned to a customer.");
		}
		else {seat[i].assign(cust_id);
			System.out.println("Seat Assigned!");
		}
	
		
	}
	
	public void unAssignSeat(int seatID) {
		int i = seatID-1;
		seat[i].unAssign();
		
	}
	
	public void unassignAllSeats() {
	for(int i = 0; i < 144; i++) {
			seat[i].unAssign();
		}
	}		
}
