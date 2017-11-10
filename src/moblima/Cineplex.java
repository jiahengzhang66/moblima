package moblima;

public class Cineplex {
	private String cineplexName;
	private int cineplexID;
	private Cinema[] cinemas;
	private String location;
	private int noofCinemas;
	/*private ShowtimeDate[] movieTimings= new ShowtimeDate[];*/
	
	public Cineplex() {
		Cinema[] cinemas = new Cinema[3];
	}
	
	public void printCineplexID() {
		System.out.println(this.getcineplexID());
	}
	public int getcineplexID() {
		return cineplexID;		
	}
	public String getcineplexName() {
		return cineplexName;		
	}
	public String location() {
		return location;		
	}
	public int getNoOfCinemas() {
		return noofCinemas;		
	}
	public void getMovieTimings() {
		//need stuff
	}
	
}
