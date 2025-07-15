package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updateuser {
public static void main(String[] args) throws SQLException {
	Connection con;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	 stmt=con.createStatement();
	stmt.executeUpdate("delete from users where id=8");


 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	ResultSet rs=stmt.executeQuery("select * from users");

	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
	}

}
}
