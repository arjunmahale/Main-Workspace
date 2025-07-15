package working_on_images;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addingimages {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		//blob datatype  is used to store the image in the db
		//it store images of 64kb size
		//use mediumblob for large images
		/*
		 *
		 * | Type         | Max Size  | Use Case                                    |
| ------------ | --------- | ------------------------------------------- |
| `TINYBLOB`   | 255 bytes | Very small files                            |
| `BLOB`       | 64 KB     | Small images (e.g., profile pics)           |
| `MEDIUMBLOB` | 16 MB     | Medium-size images, docs                    |
| `LONGBLOB`   | 4 GB      | Large files (e.g., videos, high-res images) |

		 */

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement pst= con.prepareStatement("insert into imagetable values(?,?)");
			FileInputStream file=new FileInputStream("C:/Users/HP/Downloads/PngItem_1562020.png");
			pst.setString(1, "mario");
			pst.setBinaryStream(2, file);
			pst.executeUpdate();
System.out.println("image uploaded");





		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
