package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddFoundItem {

    public static void addFoundItem(String name, String category, String date, String location) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO found_items (item_name, category, found_date, location) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setString(3, date);
            ps.setString(4, location);

            ps.executeUpdate();
            con.close();

            System.out.println("Found item added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
