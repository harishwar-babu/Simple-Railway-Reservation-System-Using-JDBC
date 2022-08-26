package user;
import java.util.*;
public class usermain extends userbooking {
	public void user()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello User Welcome to Railway-Reservation Application");
		System.out.println("Which one Do you like to Perform");
		System.out.println("1.Book a Ticket");
		System.out.println("2.Your Bookings");
		System.out.println("Enter your Option (1 or 2)?");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			book();
			break;
		case 2:
			System.out.println("Enter your BookingID");
			int id = sc.nextInt();
			detailsbyid(id);
			break;
		default:
			System.out.println("Not Found");
			break;
		}
		sc.close();
	}
}
