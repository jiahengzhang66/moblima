package moblima;

import java.io.*;
import java.util.*;
import java.text.ParseException;


public abstract class Ticket {

	public double ticketID = 1; //remove "abstract" variables in class diagram
	public int seatID;
	public boolean assigned;
	public int movieID;
	public int cust_id; //add to class diagram
	public String ticketType; 
	public float priceModifier;
	public boolean datePriceStatus;
	public float datePrice;

	
	public Ticket(int seatID, int movieID) { //change to class diagram
		this.ticketID = generateTicketID();
		this.seatID = seatID;
		this.movieID=movieID;
		//Movies.totalTicketSales++;
	}
	
	public double generateTicketID() { //add to class diagram
		ticketID++;
		return ticketID;
	}
	
	public void setSeatID(int seatID) { //add to class diagram
		this.seatID = seatID;
	}
	public void assign(int cust_id) {
		this.cust_id = cust_id;
		assigned = true;
	}
	
	public int getCustomerID() { //add to class diagram
		return this.cust_id;
	}
	public void unAssign() {
		this.cust_id = -1;
		assigned = false;
	}

	public Date convertHolidayDate(String day, String month, String date, String year) throws ParseException {
		holidayDateList hd = new holidayDateList();
		String a = hd.stringHolidayDate(day, month, date, year);
		Date d = hd.stringToDate(a);
		return d;
	}
	
	public Date insertDate () throws ParseException{
		System.out.println("Insert Day, month, date, then followed by year");
		String day, month, date, year;
		Scanner sc = new Scanner(System.in);
		day = sc.next();
		month = sc.next();
		date = sc.next();
		year = sc.next();
		return convertHolidayDate(day, month, date, year);
	}
	public boolean checkSpecialDate (Date a) throws ParseException {
	holidayDateList hd = new holidayDateList();
	for (int i = 0; i < hd.holidayDate.length; i++ ) {
		if (a.equals(hd.holidayDate[i])) {
			return true;
			}
		}
	return false;
	}

	 //add everything to class diagram
	public abstract void setPriceModifier(float priceModifier);
	public abstract String getTicketType();
	public abstract float getPriceModifier();
}
