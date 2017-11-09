package moblima;

import java.io.File;
import java.util.*;
import java.util.Calendar;
import java.util.List;

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
	
	private boolean blockbuster;
	
	private String typeOfMovie; 
	
	private float movieTypePriceModifier; 
	
	public String Movie(String title) {
		this.title = title;
		return title;
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
		return blockbuster;
	}
	
	
	public void setTitle(String title) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setMovieID(int movieID) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setReleaseDate(Date releaseDate) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setLanguage(String language) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setSynopsis(String synopsis) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setStatus(String status) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setAgeRating(String agerating) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setCineplexs(String[] Cineplexs) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setActors(String actors) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setDirector(String director) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	public void setBlockBuster(boolean blockbuster) {
		int i;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
	}
	
	abstract String typeOfMovie();
	
	abstract float movieTypePriceModifier(boolean blockBuster) ;
	}