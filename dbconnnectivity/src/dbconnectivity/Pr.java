package dbconnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Pr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter role (master/shop/cashier/stock): ");
        String role = sc.nextLine();

        System.out.println();
        if (authenticateUser(username, password)) {
            System.out.println("\n✅ Login successful!");

            // Simulate redirect based on role
            switch (role.toLowerCase()) {
                case "master":
                    System.out.println("Redirecting to masterDashboard.jsp...");
                    break;
                case "shop":
                    System.out.println("Redirecting to shopDashboard.jsp...");
                    break;
                case "cashier":
                    System.out.println("Redirecting to cashierDashboard.jsp...");
                    break;
                case "stock":
                    System.out.println("Redirecting to stockDashboard.jsp...");
                    break;
                default:
                    System.out.println("⚠️ Unknown role. Redirecting to home page...");
            }
        } else {
            System.out.println("\n❌ Invalid username or password.");
        }

        sc.close();
    }

    public static boolean authenticateUser(String uname, String pass) {
        boolean isAuthenticated = false;

        try {
            Connection con = connect();
            if (con == null) {
                System.out.println("❌ Database connection failed.");
                return false;
            }

            String sql = "SELECT * FROM user WHERE uname = ? AND pass = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

            	System.out.println(rs.getString(1)+rs.getString(2));
                isAuthenticated = true;
            }

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return isAuthenticated;
    }

    public static Connection connect() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/demo"; // 🔁 replace with your DB
        String user = "root"; // 🔁 replace with your DB user
        String password = "root"; // 🔁 replace with your DB password

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
