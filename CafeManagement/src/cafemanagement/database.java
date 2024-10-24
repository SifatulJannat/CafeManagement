package cafemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/cafe", "root", ""); // Database link
            return connect;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
