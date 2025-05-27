import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter student names (type 'exit' to stop):");

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            students.add(name);
        }

        System.out.println("\nList of Students:");
        for (String student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
