package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MatchItem {

    public static void findMatches() {
        try {
            Connection con = DBConnection.getConnection();

            String sql =
                "SELECT l.item_name, l.category, l.location " +
                "FROM lost_items l INNER JOIN found_items f " +
                "ON l.category = f.category AND l.location = f.location";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("Matching Items:");
            while (rs.next()) {
                System.out.println(
                    rs.getString("item_name") + " | " +
                    rs.getString("category") + " | " +
                    rs.getString("location")
                );
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
