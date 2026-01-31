package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/lost_found_db";
            String user = "root";
            String password = "san@123"; // 🔴 put real password

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected");
            return con;

        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}
