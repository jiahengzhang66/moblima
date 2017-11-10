package moblima;


public class Review {
	private String title;
	private String content;
	private int movieID;
	private String review;
	
	public Review(int movieID, String review) {
		this.movieID = movieID;
		content = review;
	}
	
	public int getMovieID() {
		return movieID;
	}
	
	public String getReview() {
			return review;
	}
	
	public void setReview(String RW) {
		review = RW;
	}

}
