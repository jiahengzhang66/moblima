package moblima;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Booking {
	private int bookingID;
	//private String Name;
	private double mobileNum;
	private String email;
	private double ticketID;
	private double cinemaCode;
	private Date dateTime;
	private int movieID;
	
public Booking(int bookingID, /*String name*/ double mobileNum, String email, double cinemaCode, Date dateTime, int movieID) {
	this.bookingID = bookingID;
	this.mobileNum = mobileNum;
	this.email = email;
	this.movieID = movieID;
	this.cinemaCode = cinemaCode;
	this.dateTime = dateTime;
	//this.ticketID = this.setTicketID();
}
public Booking() {}
/*private double setTicketID() {
	
}*/


public void createExcelFile() {
	HSSFWorkbook wb = new HSSFWorkbook();
    FileOutputStream fileOut;
	try {
		fileOut = new FileOutputStream("Booking Database.xls");
		wb.write(fileOut);
	    fileOut.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    }
}
