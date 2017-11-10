package moblima;
import java.util.Scanner;

public class AdminController {
	Scanner sc = new Scanner(System.in);
	
	//public LoginState {LOGINSUCCESS, INCORRECTUSERNAME, INCORRECTPASSWORD};
	private boolean loginSuccess = false;
	
	/* defines admin username as "staff" */
	private static final String correctAdminUser = "admin";
	
	/* defines admin password as "moblima" */
	private static final String correctAdminPassword = "moblima";
	
	public AdminController() {}
	
	public boolean login() {
		String inputAdminUser;
		String inputAdminPassword;
		do {
		System.out.println("Please enter username: ");
		inputAdminUser = sc.nextLine();
		System.out.println("Please enter password: ");
		inputAdminPassword = sc.nextLine();
		if (inputAdminUser == correctAdminUser && inputAdminPassword == correctAdminPassword) {
			loginSuccess = true;
			System.out.println("Login Success.");
		}
		else
			System.out.println("Incorrect Username or Password");
		} while (loginSuccess = false);
		return loginSuccess;
	}
}
