import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student details (ID and name). Type -1 to stop.");

        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (id == -1) {
                break;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search for student name: ");
        int searchId = scanner.nextInt();
        String studentName = studentMap.get(searchId);

        if (studentName != null) {
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
