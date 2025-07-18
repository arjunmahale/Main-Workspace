package dbconnnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;






public class Pr{
	public static void main(String[] args) throws SQLException {
		Connection con=null;;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root");

			 if(con!=null) {
				 System.out.println("Connection  Established..");
			 }
			 else
			 {
				 System.out.println("connection not established");
			 }

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	Statement stmt=	con.createStatement();
	ResultSet rs= stmt.executeQuery("select * from users");
	ResultSetMetaData rt=rs.getMetaData();
	while(rs.next())
	{
		for(int i=1;i<=rt.getColumnCount();i++)
		{
			System.out.print(rs.getString(i)+"\t");
		}
		System.out.println();
	}

	PreparedStatement pr= con.prepareStatement("insert into users values(?,?,?,?)");
	pr.setInt(1, 7);
	pr.setString(2, "bhavesh");
	pr.setString(3, "bhavesh@gmail.com");
	pr.setString(4, "pass@123");
	pr.execute();

	}
}
