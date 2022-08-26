package admin;
import java.util.*;
public class adminmain extends adminactivity {
	public void admin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Admin Welcome to Railway-Reservation Application");
		System.out.println("Which one Do you like to Perform");
		System.out.println("1.UserBookings");
		System.out.println("2.Bookings from Source To Destination");
		System.out.println("Enter your Option (1 or 2)?");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			userbookings();
			break;
		case 2:
			System.out.println("Enter the Source City");
			String from = sc.next();
			System.out.println("Enter Destination City");
			String to = sc.next();
			detailsfromto(from,to);
			break;
		default:
			System.out.println("Not Found");
			break;
		}
		sc.close();
	}
}
