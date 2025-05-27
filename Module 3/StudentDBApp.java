import java.sql.*;

class StudentDAO {
    private Connection conn;

    public StudentDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertStudent(int id, String name) throws SQLException {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
        System.out.println("Student inserted.");
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        System.out.println("Student updated.");
    }
}

public class StudentDBApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "Kad@239!";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            StudentDAO dao = new StudentDAO(conn);

            dao.insertStudent(3, "Akshaya");
            dao.updateStudent(4, "Kathyayini");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
