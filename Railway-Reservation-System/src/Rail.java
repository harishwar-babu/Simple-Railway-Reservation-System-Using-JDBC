import user.usermain;
import admin.adminmain;
import java.util.*;
public class Rail
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Railway-Reservation-System");
		System.out.println("1.Admin");
		System.out.println("2.User");
		System.out.println("Enter the Option(1 or 2)?");
		int option = sc.nextInt();
		switch(option)
		{
		case 1:
			adminmain admin = new adminmain();
			admin.admin();
			break;
		case 2:
			usermain user = new usermain();
			user.user();
			break;
		default:
			System.out.println("Not Found");
			break;
		}
		sc.close();
	}
}