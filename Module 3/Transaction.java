import java.sql.*;

public class Transaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "root";
        String password = "Kad@239!";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false); // Start transaction

            try {
                // Debit Alice
                PreparedStatement debitStmt = conn.prepareStatement(
                        "UPDATE accounts SET balance = balance - ? WHERE id = ?");
                debitStmt.setDouble(1, 200);
                debitStmt.setInt(2, 1);
                debitStmt.executeUpdate();

                // Credit Bob
                PreparedStatement creditStmt = conn.prepareStatement(
                        "UPDATE accounts SET balance = balance + ? WHERE id = ?");
                creditStmt.setDouble(1, 200);
                creditStmt.setInt(2, 2);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transaction successful. Amount transferred.");

            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
