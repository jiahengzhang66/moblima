package moblima;

import java.util.Scanner;

public class MovieList {

	
	
	public void sortRankingRating() {
		int i;
		int j;
		int n=1;//this is to count the array size;
		Rating[][] temp;
	
		//read the file here
		while (file[i][]!= null) {
			n++;
			i++;
		}
		
				for (i = 1; i<n; i++) {//A is the file name
				  for (j = i - 1; j >= 0 ; j —) {
				    if (A[i][0] > A[j][0]) {
				      temp = A[i][0];
				      A[i][0] = A[j][0];
				      A[j][0] = temp; }
				    else
				      break;
				}
				return A;
		}
		System.out.println("print the whole A");
	}
	
	public void sortRankingTickets() {
		int i;
		int j;
		int n=1;//this is to count the array size;
		Rating[][] temp;
		
			//read the file here
			while (file[i][]!= null) {
				n++;
				i++;
			}
			
			for (i = 1; i<n; i++) {
			  for (j = i - 1; j >= 0 ; j —) {//B is the new name
			    if (B[i][0] > B[j][0]) {
			      temp = B[i][0];
			      B[i][0] = B[j][0];
			      B[j][0] = temp; }
			    else
			      break;
			}
			return B;
	}
			
	System.out.println("print the whole B");
}
	
	public void addMovie() {
		Scanner in = new Scanner(System.in);
		System.out.println("Title: ");
		String title = in.nextLine();
		setTitle(title);
		System.out.println("Language: ");
		String language = in.nextLine();
		setLanguage(language);
		System.out.println("Synopsis: ");
		String synopsis = in.nextLine();
		setSynopsis(synopsis)
		System.out.println("Status: ");
		String status = in.nextLine();
		setStatus(status);
		System.out.println("AgeRating: ");
		String agerating = in.nextLine();
		setAgeRating(agerating);
		System.out.println("Cineplexs: ");
		String cineplex = in.nextLine();
		SetCineplex(cineplex);
		System.out.println("Actors: ");
		String actors = in.nextLine();
		setActors(actors);
		System.out.println("Directors: ");
		String director = in.nextLine();
		setDirector(director);
		System.out.println("BlockBuster: ");
		boolean bb = in.nextBoolean();
		setBlockBuster(blockbuster);
		setMovieID(//readfile[n][1] + 1);
	}
	
	public void removeMovie() {
		int i;
		int j;
		Rating[][] temp;
		
		System.out.println("Which movie do you want to remove? ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
	
		//read the file here
		while (file[i][]!= title) {
			i++;
		}
		//remove the whole row
	}
}