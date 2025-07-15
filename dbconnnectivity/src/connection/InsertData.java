package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			int id=4;
			String name="mahesh";
			String email="mahesh@gmail.com";
			String pswd="mahesh@123";


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
//			Statement stmt=con.createStatement();
//			int rs= stmt.executeUpdate("insert into users values(id,name,email,pswd)");
			PreparedStatement pst=con.prepareStatement("insert into users (id,name,email,pswd) values(?,?,?,?)");

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, pswd);
			int rs=pst.executeUpdate();

			if(rs>0)
			{
				System.out.println(rs+"row affected");
			}
			else
			{
				System.out.println("data not inserted");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("data not inserted");
			e.printStackTrace();
		}



	}

}
