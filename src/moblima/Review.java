package moblima;


public class Review {
	private String title;
	private String content;
	private int movieID;
	
	public Review(int movieID, String review) {
		this.movieID = movieID;
		content = review;
	}
	
	public int getMovieID() {
		return movieID;
	}
	
	public void displayReview(int movieID) {
			//read file here
		for (int i = 0; i <15; i ++) {
			if (file[i][1]==movieID)
			System.out.println(file[i][2])
		}
		
	}
	


}
