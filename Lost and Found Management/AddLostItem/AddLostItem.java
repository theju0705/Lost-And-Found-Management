package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddLostItem {

    public static void addLostItem(String name, String category, String date, String location) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO lost_items (item_name, category, lost_date, location) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            ps.setString(3, date);
            ps.setString(4, location);

            ps.executeUpdate();
            con.close();

            System.out.println("Lost item added");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
