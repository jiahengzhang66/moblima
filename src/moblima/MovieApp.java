package moblima;
import java.util.Scanner;


public class MovieApp {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you an admin or user?");
		System.out.println("(1): Admin");
		System.out.println("(2): User");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice)
		case 1:
			break;
		case 2:	
			do {
				System.out.println("(1) List all movie");
				System.out.println("(2) Search movie details");
				System.out.println("(3) Check seat availability");
				System.out.println("(4) Book and purchase ticket");
				System.out.println("(5) View booking history");
				System.out.println("(6) List the Top 5 rankings")
				System.out.println("(7) Exit MOBLIMA");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				
			} while (choice != 7);
			break;
		default:
				System.out.println("Invalid choice!");
		}
		
	}

}
