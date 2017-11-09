package moblima;

//import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BookingDatabaseController {
	int noOfEntries = 0; //Cannot be double
	private FileInputStream bookingDatabaseInputFile;
	private FileOutputStream bookingDatabaseOutputFile;
	
public BookingDatabaseController() {
	FileInputStream bookingDatabaseInputFile;
	FileOutputStream bookingDatabaseOutputFile;
		try{
	
			bookingDatabaseInputFile = new FileInputStream(new File("Booking Database.xls"));
			//bookingDatabaseOutputFile = new FileOutputStream(new File("Booking Database.xls")); n
			this.bookingDatabaseInputFile = bookingDatabaseInputFile;
			//this.bookingDatabaseOutputFile = bookingDatabaseOutputFile;
			POIFSFileSystem fs = new POIFSFileSystem(bookingDatabaseInputFile);
			HSSFWorkbook workbook = new HSSFWorkbook(fs);
			HSSFSheet sheet = workbook.getSheetAt(0);
			while(sheet.getRow(noOfEntries) != null) {
				noOfEntries++;
		}
			bookingDatabaseInputFile.close();
	}catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}

//	public void createExcelFile() {
//		HSSFWorkbook bookingDatabase = new HSSFWorkbook();
//	    FileOutputStream fileOut;
//		try {
//			fileOut = new FileOutputStream("Booking Database.xls");
//			bookingDatabase.write(fileOut);
//		    fileOut.close();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}
	public int generateBookingID() {
		System.out.println(noOfEntries);
			if(noOfEntries == 0) {
				return 10000;
			} else {
				return (10000 + noOfEntries);
		}
	}
	public void addBookingIntoDatabase(Booking newBooking) {
		HSSFWorkbook workbook;
		try {
			bookingDatabaseInputFile = new FileInputStream(new File("Booking Database.xls"));
			POIFSFileSystem fs = new POIFSFileSystem(bookingDatabaseInputFile);
			workbook = new HSSFWorkbook(fs);
			HSSFSheet sheet = workbook.getSheetAt(0);
			HSSFCell cell = null;
			System.out.println(sheet.getPhysicalNumberOfRows());
			//System.out.println(sheet.createRow(noOfEntries).createCell((short)0));
			cell = sheet.getRow(0).getCell(0);
			cell.setCellValue(newBooking.getBookingID());
			cell = sheet.getRow(0).getCell(1);
			cell.setCellValue(newBooking.getMobileNum());
			cell = sheet.getRow(0).getCell(2);
			cell.setCellValue(newBooking.getEmail());
			cell = sheet.getRow(0).getCell(3);
			cell.setCellValue(newBooking.getTicketID());
			cell = sheet.getRow(0).getCell(4);
			cell.setCellValue(newBooking.getCinemaCode());
			cell = sheet.getRow(0).getCell(5);
			cell.setCellValue(newBooking.getDateTime());
			cell = sheet.getRow(0).getCell(6);
			cell.setCellValue(newBooking.getMovieID());
			noOfEntries++; //Number of entries increase by 1
			bookingDatabaseInputFile.close();
			bookingDatabaseOutputFile = new FileOutputStream(new File("Booking Database.xls"));
			workbook.write(bookingDatabaseOutputFile);
			bookingDatabaseOutputFile.close();

	//Reopen Files
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

