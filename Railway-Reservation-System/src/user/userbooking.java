package user;
import java.util.*;
public class userbooking extends userDB {
	public void book()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Your name");
		String name = sc.next();
		System.out.println("From");
		String from = sc.next();
		System.out.println("To");
		String to = sc.next();
		System.out.println("Berth that you are Preferring(L,M,U)");
		String berth = sc.next();
		if(berth.equals("L"))
		{
			int v1 = count(berth);
			if(v1<20)
			{
				insert(name,from,to,berth);
			}
			else if (v1>=20)
			{
				System.out.println("Lower Berth is Not Available");
			}
		}
		
		if(berth.equals("M"))
		{
			int v1 = count(berth);
			if(v1<20)
			{
				insert(name,from,to,berth);
			}
			else if (v1>=20)
			{
				System.out.println("Middle Berth is Not Available");
			}
		}
		
		if(berth.equals("U"))
		{
			int v1 = count(berth);
			if(v1<20)
			{
				insert(name,from,to,berth);
			}
			else if (v1>=20)
			{
				System.out.println("Upper Berth is Not Available");
			}
		}
	}
}
