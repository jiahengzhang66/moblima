package moblima;

import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
// Ashley made this
		//Ada was here
		//aba
		//
		//Qinan was here
// qinan
//jji
		BookingDatabaseController controller = new BookingDatabaseController();
		Booking test1 = new Booking(controller.generateBookingID(), (double)92739376, "jiahengzhang66@gmail.com.sg", (double)100000, (double)123456, "Febuary 2nd", 10002);
=======

		int choice;
		boolean adminLogin = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you an admin or user?");
		System.out.println("(1): Admin");
		System.out.println("(2): User");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			AdminController adminController = new AdminController();	
			adminLogin = adminController.login();
			while (choice != 9 && adminLogin == true) {
			System.out.println(
			        "=========Admin Menu========\n" +
			        "(1) Create movie listing\n" +
			        "(2) Update movie listing\n" +
			        "(3) Remove movie listing\n" +
			        "(4) Create cinema showtime\n" +
			        "(5) Update cinema showtime\n" +
			        "(6) Remove cinema showtime\n" +
			        "(7) Change movie base price\n" +
			        "(8) Logout\n" +
			        "(9) Exit MOBLIMA");   
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			}
			break;
		case 2:	
			do {
				System.out.println(
						"=========User Menu========\n" +
				        "(1) List all movies\n" +
				        "(2) Search movie details\n" +
				        "(3) Book and purchase ticket\n" +
				        "(4) View booking history\n" +
				        "(5) Add movie review\n" +
				        "(6) List Top 5 rankings by sale\n" +
				        "(7) List Top 5 rankings by rating\n" +
				        "(8) Exit MOBLIMA");  
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
			} while (choice != 8);
			break;
		default:
				System.out.println("Invalid choice!");
		}
}
		
//ashley test
		/*BookingDatabaseController controller = new BookingDatabaseController();
		Booking test1 = new Booking(controller.generateBookingID(), (double)92739376, "jiahengzhang@mensa.org.sg", (double)100000, (double)123456, "Febuary 2nd", 10002);
>>>>>>> branch 'master' of https://github.com/jiahengzhang66/moblima.git
		System.out.println(test1.getBookingID() + test1.getMobileNum() + test1.getEmail() + test1.getMovieID() + test1.getCinemaCode() + test1.getTicketID() + test1.getDateTime());

		controller.addBookingIntoDatabase(test1);


		controller.addBookingIntoDatabase(test1);
		controller.printBookingHistory(5);*/

	}


