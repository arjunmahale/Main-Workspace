package dbconnnectivity;

import java.sql.*;
import java.util.Scanner;

import connection.prestate;

public class Pr {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

			if (con != null) {
				System.out.println("connection established.");
			}
			System.out.println("enter id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("enter name : ");
			String name = sc.nextLine();
			System.out.println("enter email id : ");
			String email = sc.nextLine();

			System.out.println("enter password : ");
			String password = sc.nextLine();

			PreparedStatement pst = con.prepareStatement("insert into users values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, password);
			pst.executeUpdate();
			System.out.println("data inserted successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stmt1 = con.createStatement();
		ResultSet rs = stmt1.executeQuery("select * from users");

		ResultSetMetaData rst = rs.getMetaData();
		int cnt = rst.getColumnCount();
		while (rs.next()) {
			for (int i = 1; i <= cnt; i++) {
				System.out.print(rs.getString(i) + "\t");

			}
			System.out.println();
		}
	}

}
