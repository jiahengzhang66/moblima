package moblima;

public class MovieApp {

	public static void main(String[] args) {
<<<<<<< HEAD
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
				System.out.println("(1) List all movies");
				System.out.println("(2) Search movie details");
				System.out.println("(3) Check seat availability");
				System.out.println("(4) Book and purchase ticket");
				System.out.println("(5) View booking history");
				System.out.println("(6) List the Top 5 rankings by sale");
				System.out.println("(7) List the Top 5 rankings by rating");
				System.out.println("(8) Exit MOBLIMA");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					
				}
			} while (choice != 7);
			break;
		default:
				System.out.println("Invalid choice!");
		}
		
=======
		// TODO Auto-generated method stub
// Ashley made this
		//Ada was here
		//aba
		//
		//Qinan was here
		BookingDatabaseController controller = new BookingDatabaseController();
		Booking test1 = new Booking(controller.generateBookingID(), (double)92739376, "jiahengzhang@mensa.org.sg", (double)100000, (double)123456, "Febuary 2nd", 10002);
		System.out.println(test1.getBookingID() + test1.getMobileNum() + test1.getEmail() + test1.getMovieID() + test1.getCinemaCode() + test1.getTicketID() + test1.getDateTime());

		controller.addBookingIntoDatabase(test1);


		controller.addBookingIntoDatabase(test1);
		controller.printBookingHistory(5);

	}

}
