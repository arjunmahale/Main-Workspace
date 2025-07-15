package resultsetmetadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class remetadata {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//resulsetmetadata interface ->used to get data about the data
		/*/DatabaseMetaData provides details like:

Database name and version

Driver details

List of tables

List of columns

Supported features (e.g., transactions, joins)*/


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from users");

	ResultSetMetaData mt=rs.getMetaData();
	System.out.println(mt.getColumnClassName(1));
	System.out.println(mt.getColumnName(1));
	System.out.println(mt.getScale(1));
	System.out.println(mt.getTableName(1));
	System.out.println(mt.getColumnCount());
	System.out.println(mt.isAutoIncrement(1));

	System.out.println("info of databasemetadata");
DatabaseMetaData dmt=con.getMetaData();
System.out.println(dmt.getDatabaseProductName());
System.out.println(dmt.getJDBCMajorVersion());
System.out.println(dmt.getConnection());
System.out.println(dmt.getDatabaseProductVersion());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
