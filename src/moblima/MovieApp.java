package moblima;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Ashley made this
		//Ada was here
		//aba
		//
		//Qinan was here
		BookingDatabaseController controller = new BookingDatabaseController();
		Booking test1 = new Booking(controller.generateBookingID(), (double)92739376, "jiahengzhang66@gmail.com.sg", (double)100000, (double)123456, "Febuary 2nd", 10002);
		System.out.println(test1.getBookingID() + test1.getMobileNum() + test1.getEmail() + test1.getMovieID() + test1.getCinemaCode() + test1.getTicketID() + test1.getDateTime());
		controller.addBookingIntoDatabase(test1);
		controller.printBookingHistory(5);
	}

}
