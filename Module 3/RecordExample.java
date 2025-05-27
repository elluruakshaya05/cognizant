import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Record declaration (Java 16+)
record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Arun", 20),
                new Person("Bina", 30),
                new Person("Chitra", 25),
                new Person("Dev", 17)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nPeople age 18 or above:");
        List<Person> adults = people.stream()
                .filter(p -> p.age() >= 18)
                .collect(Collectors.toList());
        adults.forEach(System.out::println);
    }
}
