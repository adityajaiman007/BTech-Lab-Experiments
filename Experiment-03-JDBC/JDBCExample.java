
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "your_password";

        try {
            Connection con = DriverManager.getConnection(
                url, user, password
            );

            System.out.println("Database connected successfully!");

            con.close();
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
