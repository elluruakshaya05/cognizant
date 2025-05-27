import java.sql.*;

public class BasicJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "Kad@239!";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
