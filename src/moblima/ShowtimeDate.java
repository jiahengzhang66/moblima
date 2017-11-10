package moblima;

import java.io.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Calendar;

public class ShowtimeDate {

	public Calendar cal = Calendar.getInstance();
	public int year, month, day;
	public int[] showTimesList = new int[10];
	public int numShowTimes = 0;
	public int showTime;
	
	public ShowtimeDate(int year, int month, int day) {
		cal.set(year, month,day);
		this.year = cal.get(Calendar.YEAR);
		this.month = cal.get(Calendar.MONTH);
		this.day = cal.get(Calendar.DAY_OF_MONTH);
	};
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		 return month;
		}
	public int getDay() {
		 return day;
		}

	public void setShowTimes (int showTimes) {
		showTimesList[numShowTimes] = showTimes;
		numShowTimes++;
	}
	
	public void printDate() {
		System.out.println("Calendar's toString() is : " + cal + "\n");
	}
	
	public int getShowTimes (int num) {
		return showTimesList[num];
	}
	
	

	
	public int getNumShowTimes() {
		return this.numShowTimes;
	}
}

