package admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class adminactivity {
	static final String DB_URL = "jdbc:mysql://localhost/Schema-Name";
	static final String USER = "root";
	static final String PASS = "root";
	public void detailsfromto(String from,String to)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();)
		{
			String sql = "SELECT * fROM user WHERE source =? AND destination=?"; 
			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setString(1,from);
			psm.setString(2, to);
			ResultSet rs = psm.executeQuery();
			while(rs.next())
			{
				System.out.print("Booking ID: "+rs.getInt("id")+" ");
				System.out.print("Name: "+rs.getString("name")+" ");
				System.out.print("From: "+rs.getString("source")+" ");
				System.out.print("To: "+rs.getString("destination")+" ");
				System.out.println("Berth-Type: "+rs.getString("berth")+" ");
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error Occured the Database");
		}

	}
	
	public void userbookings()
	{
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();)
		{
			String sql = "SELECT * from user"; 
			PreparedStatement psm = conn.prepareStatement(sql);
			ResultSet rs = psm.executeQuery();
			while(rs.next())
			{
				System.out.print("Booking ID: "+rs.getInt("id")+" ");
				System.out.print("Name: "+rs.getString("name")+" ");
				System.out.print("From: "+rs.getString("source")+" ");
				System.out.print("To: "+rs.getString("destination")+" ");
				System.out.println("Berth-Type: "+rs.getString("berth")+" ");
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error Occured the Database");
		}
	}
}
