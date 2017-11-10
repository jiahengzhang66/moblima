package moblima;

import java.util.*;
import java.util.ArrayList;
import java.util.Date;

import java.util.Scanner;
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

public class MovieDataBaseController {
	ArrayList <Movies> A = new ArrayList<Movies>();
		int noOfRow = 0; //calculate n;
		private FileInputStream movieDataInputFile;
		private FileOutputStream movieDataOutputFile;
		
		public MovieDataBaseController() {//this will read the file first;
			FileInputStream movieDataInputFile;
			FileOutputStream movieDataOutputFile;
				try{
			
					movieDataInputFile = new FileInputStream(new File("movie.xls"));
					//bookingDatabaseOutputFile = new FileOutputStream(new File("Booking Database.xls")); n
					this.movieDataInputFile = movieDataInputFile;
					//this.bookingDatabaseOutputFile = bookingDatabaseOutputFile;
					POIFSFileSystem ms = new POIFSFileSystem(movieDataInputFile);
					HSSFWorkbook workbook = new HSSFWorkbook(ms);
					HSSFSheet sheet = workbook.getSheetAt(0);
					while(sheet.getRow(noOfRow) != null) {
						noOfRow++;
				}
					movieDataInputFile.close();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		public int getTotalMovies() {
			return noOfRow;
		}
		public void generateMovieArray(){//this is to print the movie in the data file without ranking
			try {
				movieDataInputFile = new FileInputStream(new File("movie.xls"));
				POIFSFileSystem ms = new POIFSFileSystem(movieDataInputFile);
				HSSFWorkbook workbook = new HSSFWorkbook(ms);
				HSSFSheet sheet = workbook.getSheetAt(0);
				for(int i =0; i < noOfRow; i++) {
					
					Movies MV = new Movies(sheet.getRow(i).getCell(0).getStringCellValue(), 
											(int)sheet.getRow(i).getCell(1).getNumericCellValue(),
											sheet.getRow(i).getCell(2).getDateCellValue(),
											sheet.getRow(i).getCell(3).getStringCellValue(),
											sheet.getRow(i).getCell(4).getStringCellValue(),
											sheet.getRow(i).getCell(5).getStringCellValue(),
											sheet.getRow(i).getCell(6).getStringCellValue(),
											sheet.getRow(i).getCell(7).getStringCellValue(),
											sheet.getRow(i).getCell(8).getStringCellValue(),
											sheet.getRow(i).getCell(9).getStringCellValue(),
											sheet.getRow(i).getCell(10).getBooleanCellValue(),
											sheet.getRow(i).getCell(11).getNumericCellValue());
				
								
					A.add(MV);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void displayMovies() {
			int i = 0;
			while(A.get(i) != null) {
			System.out.println("============================================");
			System.out.print("Title: " + A.get(i).getTitle() + "\n"
							+"movieID: " + A.get(i).getMovieID() + "\n"
							+"genre: "+ A.get(i).getGenre() + "\n"
							+"synopsis: "+A.get(i).getSynopsis() + "\n"
							+"status: "+ A.get(i).getStatus() + "\n"
							+"ageRating: "+ A.get(i).getAgeRating() + "\n"
							+"genre: "+ A.get(i).getActors() + "\n"
							+"genre: "+ A.get(i).getDirector() + "\n"
							+"genre: "+ A.get(i).getBlockBuster() + "\n"
							+"genre: "+ A.get(i).getAverageRating() + "\n"
							+"genre: "+ A.get(i).getTotalTicketSale() + "\n");
			System.out.println("============================================");
			i++;
			}
		}
		
		public int setMovieID() {
			System.out.println(noOfRow);
				if(noOfRow == 0) {
					return 10000;
				} else {
					return (10000 + noOfRow);
			}
		}
		
	public ArrayList<Movies> getMoviesList() {
		return A;
		}
	
	public Movies searchMovie(int IDToSearch) {
		int o = 0;
		while(A.get(o).getMovieID() != IDToSearch) {
			o++;
		}
		return A.get(o);
	}
	
	public void addMovie(Movies newMovie) {//add to the arraylist
			A.add(newMovie);
			noOfRow++;
	}
	
	public void removeMovie(int MovieID) {//this is to remove something from the data
		int i=0;
		while (i!=0) {
			if (A.get(i).getMovieID() == MovieID ) {
				A.remove(i);
				noOfRow--;
			}
		}
		
		}
	
	
	public void write(ArrayList A) {
		HSSFWorkbook workbook;
		int z;	
	try {
		movieDataInputFile = new FileInputStream(new File("movie.xls"));
		POIFSFileSystem ms = new POIFSFileSystem(movieDataInputFile);
		workbook = new HSSFWorkbook(ms);
		HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFCell cell = null;
		for (z=0;z<noOfRow;z++) {
		cell = sheet.createRow(noOfRow).createCell(0);
		cell.setCellValue(((Movies) A.get(z)).getTitle());
		cell = sheet.createRow(noOfRow).createCell(1);
		cell.setCellValue(((Movies) A.get(z)).getMovieID());
		cell = sheet.createRow(noOfRow).createCell(2);
		cell.setCellValue(((Movies) A.get(z)).getReleaseDate());
		cell = sheet.createRow(noOfRow).createCell(3);
		cell.setCellValue(((Movies) A.get(z)).getGenre());
		cell = sheet.createRow(noOfRow).createCell(4);
		cell.setCellValue(((Movies) A.get(z)).getLanguage());
		cell = sheet.createRow(noOfRow).createCell(5);
		cell.setCellValue(((Movies) A.get(z)).getSynopsis());
		cell = sheet.createRow(noOfRow).createCell(6);
		cell.setCellValue(((Movies) A.get(z)).getStatus());
		cell = sheet.createRow(noOfRow).createCell(7);
		cell.setCellValue(((Movies) A.get(z)).getAgeRating());
		cell = sheet.createRow(noOfRow).createCell(8);
		cell.setCellValue(((Movies) A.get(z)).getActors());
		cell = sheet.createRow(noOfRow).createCell(9);
		cell.setCellValue(((Movies) A.get(z)).getDirector());
		cell = sheet.createRow(noOfRow).createCell(10);
		cell.setCellValue(((Movies) A.get(z)).getBlockBuster());
		cell = sheet.createRow(noOfRow).createCell(11);
		cell.setCellValue(((Movies) A.get(z)).getAverageRating());
		} 
		movieDataInputFile.close();
		movieDataOutputFile = new FileOutputStream(new File("movie.xls"));
		workbook.write(movieDataOutputFile);
		movieDataOutputFile.close();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}
}
		



