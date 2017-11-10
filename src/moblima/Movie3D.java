package moblima;

import java.util.Date;


public class Movie3D extends Movies{
	
	public Movie3D(String title,int movieID,Date releaseDate,String genre,String language,
			String synopsis,String status,String ageRating,String actors, String director, boolean blockBuster,double totalRating) {
			super (title,movieID, releaseDate, genre, language,
					synopsis, status, ageRating, actors, director, blockBuster, totalRating);
	}
	private float movieTypePriceModifier = 3.0f;//default price 

	float movieTypePriceModifier (boolean blockBuster) {
		if (blockBuster==true) {
			return movieTypePriceModifier*2;
		}
		else {
			return movieTypePriceModifier;
		}
	}

}
