package moblima;

public class Rating {
	private String title;
	private int movieID;
	private float rating;
	private float totalRating;///added this new attribute
	
	public Rating(int movieID, int rating) {
		this.movieID = movieID;
		this.rating = rating;
	}
	
	public int getMovieID() {
		return movieID;
	}
	
	public float getRating() {
		return rating;
	}
		
	public void setRating(int R) {
		rating = R;
		
	}
	
	
}

