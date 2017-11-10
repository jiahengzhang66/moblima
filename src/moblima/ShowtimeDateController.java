package moblima;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowtimeDateController {
		int noOfEntries = 0; //Cannot be double
		private FileInputStream bookingDatabaseInputFile;
		private FileOutputStream bookingDatabaseOutputFile;
		
	public ShowtimeDateController() {
		FileInputStream bookingDatabaseInputFile;
		FileOutputStream bookingDatabaseOutputFile;
			try{
		
				bookingDatabaseInputFile = new FileInputStream(new File("Showtime Database.xls"));
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
	
	public void printShowTimes(int day, int month, int year) {
		try {
			bookingDatabaseInputFile = new FileInputStream(new File("Showtime Database.xls"));
			POIFSFileSystem fs = new POIFSFileSystem(bookingDatabaseInputFile);
			HSSFWorkbook workbook = new HSSFWorkbook(fs);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			for (int a = noOfEntries - 1; a < noOfEntries; a++) {
				if (sheet.getRow(a).getCell(0).getNumericCellValue() == year && sheet.getRow(a).getCell(1).getNumericCellValue() == month && sheet.getRow(a).getCell(2).getNumericCellValue() == day) {
					System.out.println("============================================");
					
					System.out.print("Year: " +(int)sheet.getRow(a).getCell(0).getNumericCellValue() + " ");
					System.out.print("Month: " +(int)sheet.getRow(a).getCell(1).getNumericCellValue()+ 1 + " ");
					System.out.print("Day: " +(int)sheet.getRow(a).getCell(2).getNumericCellValue() + " ");
					System.out.print("Timings: ");
					
					for (int b = 3; b < 13; b++) {
					if (sheet.getRow(a).getCell(b) != null ) {
					System.out.print((int)sheet.getRow(a).getCell(b).getNumericCellValue());
					System.out.print(" ");
					}
				}
					System.out.print("\n");
				}
			}
		}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void addShowtimeDateIntoDatabase(ShowtimeDate newShowtime, int showTime) {
		HSSFWorkbook workbook;
		try {
			newShowtime.setShowTimes(showTime); 
			bookingDatabaseInputFile = new FileInputStream(new File("Showtime Database.xls"));
			POIFSFileSystem fs = new POIFSFileSystem(bookingDatabaseInputFile);
			workbook = new HSSFWorkbook(fs);
			HSSFSheet sheet = workbook.getSheetAt(0);
			HSSFCell cell = null;
			System.out.println(sheet.getPhysicalNumberOfRows());
			//System.out.println(sheet.createRow(noOfEntries).createCell((short)0));
			cell = sheet.createRow(noOfEntries).createCell(0);
			cell.setCellValue(newShowtime.getYear());
			cell = sheet.getRow(noOfEntries).createCell(1);
			cell.setCellValue(newShowtime.getMonth());
			cell = sheet.getRow(noOfEntries).createCell(2);
			cell.setCellValue(newShowtime.getDay());
			for (int i = 0; i < newShowtime.numShowTimes; i++) {
		
			cell = sheet.getRow(noOfEntries).createCell(i+3);
			cell.setCellValue(newShowtime.getShowTimes(i));

			}
			newShowtime.numShowTimes++;
			noOfEntries++; //Number of entries increase by 1
			bookingDatabaseInputFile.close();
			bookingDatabaseOutputFile = new FileOutputStream(new File("Showtime Database.xls"));
			workbook.write(bookingDatabaseOutputFile);
			bookingDatabaseOutputFile.close();

	//Reopen Files
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
