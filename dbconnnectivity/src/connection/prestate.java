package connection;


import java.sql.*;
import java.util.Scanner;





public class prestate {

	public Connection connect() throws SQLException {
		Connection con=null;
		try {

			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
	public void getuserslist()
	{

		try {
			Connection con=connect();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from users");

			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
			}



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void addnewuser(int id,String name,String email,String pswd)
	{
;
		try {
			Connection con=connect();
			PreparedStatement stmt=con.prepareStatement("insert into users(id,name,email,pswd)values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, pswd);
			stmt.execute();




		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prestate p1=new prestate();

		Scanner sc=new Scanner(System.in);
		while(true)
		{

			System.out.println("------------------\nenter you choice:\n1.show users\n2.insert new user");
			int ch=sc.nextInt();
			switch (ch) {
			case 1: {

				p1.getuserslist();
	break;
			}
			case 2:{

				System.out.println("enter id: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name: ");
				String name=sc.nextLine();
				System.out.println("enter email: ");
				String email=sc.nextLine();
				System.out.println("enter pswd: ");
				String pswd=sc.nextLine();
				p1.addnewuser(id, name, email, pswd);
				System.out.println("user added");
	break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}




		}
			}

}
