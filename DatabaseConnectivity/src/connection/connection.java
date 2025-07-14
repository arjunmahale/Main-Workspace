package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			//driver register->load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//make connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			//statement creation
			Statement stmt=con.createStatement();

			
			//executequery-> use when all of select
			//executeupdate->use when update other that ^
			//execute -> both can be used
			ResultSet rs=stmt.executeQuery("select * from users");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getString(3)+" "+" "+rs.getString(4));
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
