import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anu");
        names.add("Kiran");
        names.add("Divya");
        names.add("Akshaya");

        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}