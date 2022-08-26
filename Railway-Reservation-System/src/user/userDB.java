package user;
import java.sql.Connection;
import java.util.Random;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class userDB {
	static final String DB_URL = "jdbc:mysql://localhost/schema name";
	static final String USER = "root";
	static final String PASS = "root";
	Random r = new Random();
	int id = Math.abs(r.nextInt());
	public void insert(String name,String from,String to,String berth)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();)
		{
			
			String sql = "INSERT INTO user VALUES(?,?,?,?,?)";
			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setInt(1, id);
			psm.setString(2, name);
			psm.setString(3, from);
			psm.setString(4, to);
			psm.setString(5, berth);
			psm.executeUpdate();
	        System.out.println("Booked SuccessFully!!!!"+" "+"Your Booking ID is "+" "+id);
		}
		catch(SQLException e)
		{
			System.out.println("Error in inserting into the Database"+e);
		}
	}
	public int count(String berth)
	{
		int count=0;
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();)
		{
			String sql = "SELECT COUNT(*) from user where berth =?"; 
			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setString(1, berth);
			ResultSet rs = psm.executeQuery();
			rs.next();
			count = rs.getInt(1);
		}
		catch(SQLException e)
		{
			System.out.println("Error Occured in the Database"+e);
		}
		return count;
	}
	public void detailsbyid(int id)
	{
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();)
		{
			String sql = "SELECT * from user where id =?"; 
			PreparedStatement psm = conn.prepareStatement(sql);
			psm.setInt(1,id);
			ResultSet rs = psm.executeQuery();
			while(rs.next())
			{
				System.out.print("Booking ID: "+rs.getInt("id")+" ");
				System.out.print("Name: "+rs.getString("name")+" ");
				System.out.print("From: "+rs.getString("source")+" ");
				System.out.print("To: "+rs.getString("destination")+" ");
				System.out.print("Berth-Type: "+rs.getString("berth")+" ");
			}//1184621199
			conn.close();
		}
		catch(SQLException e)
		{
			System.out.println("Error Occured the Database");
		}
	}
}
