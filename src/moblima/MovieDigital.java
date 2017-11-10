package moblima;


import java.util.Date;


public class MovieDigital extends Movies{
	
		public MovieDigital(String title,int movieID,Date releaseDate,String genre,String language,
				String synopsis,String status,String ageRating,String actors, String director, boolean blockBuster, double totalRating)
				{
				super (title,movieID, releaseDate, genre, language,
						synopsis, status, ageRating, actors, director, blockBuster, totalRating);
		}
	
	private float movieTypePriceModifier= 2.0f;//default price 
	
	
	float movieTypePriceModifier (boolean blockBuster) {
		if (blockBuster==true) {
			return movieTypePriceModifier*2;
		}
		else {
			return movieTypePriceModifier;
		}
	}
}

