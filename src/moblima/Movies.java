package moblima;

import java.util.Date;

import assignment.Movies;

public abstract class Movies {
	
	
	private String title;
	
	private int movieID;
	
	private Date releaseDate; 
	
	private String genre;
	
	private String 	language;
	
	private String synopsis;
	
	private String status;
	
	private String ageRating;
	
	private String[] cineplexes;
	
	private String actors;
	
	private String director;
	
	private boolean blockBuster;
	
	private int totalTicketSale;
	
	private String typeOfMovie; 
	
	public Movies(String title,int movieID,Date releaseDate,String genre,String language,String synopsis,String status,String ageRating,String[] cineplexes,String actors, String director, boolean blockBuster) {
		this.title = title;
		this.movieID= movieID;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.language = language;
		this.synopsis = synopsis;
		this.status = status;
		this.ageRating = ageRating;
		this.cineplexes = cineplexes;
		this.actors = actors;
		this.director = director;
		this.blockBuster = blockBuster;
		}
	
	public String getTitle() {
		return title;
	}
	
	public int getMovieID() {
		return movieID;
	}
	
	public Date getReleaseDate() {
		return releaseDate;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String[] getCineplexs() {
		return cineplexes;
	}
	
	public String getActors() {
		return actors;
	}
	
	public String getDirector() {
		return director;
	}
	
	public boolean getBlockBuster() {
		return blockBuster;
	}
	
	public int getTotalTicketSale() {
		return totalTicketSale;
	}
	
	public void setTotalTicketSale(int TTs) {
		totalTicketSale = TTs;
	}
	public void setTitle(String T) {
		title = T;
		
	}
	
	public void setMovieID(int ID) {
		movieID=ID;
	}
	
	public void setReleaseDate(Date RD) {
		releaseDate = RD;
	}
	
	public void setLanguage(String L) {
		language = L;
	}
	
	public void setSynopsis(String S) {
		synopsis = S;
	}
	
	public void setStatus(String ST) {
		status = ST;
	}
	
	public void setAgeRating(String AR) {
		ageRating = AR;
	}
	
	public void setCineplexs(String[] C) {
		cineplexes = C;
	}
	
	public void setActors(String A) {
		actors = A;
	}
	
	public void setDirector(String D) {
		director = D;
	}
	
	public void setBlockBuster(boolean B) {
		blockBuster = B;
	}
	
	
	abstract float movieTypePriceModifier(boolean blockBuster) ;
	

}