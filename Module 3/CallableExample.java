import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        // Create a fixed thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // List to hold Future objects
        List<Future<Integer>> futures = new ArrayList<>();

        // Submit 10 Callable tasks
        for (int i = 1; i <= 10; i++) {
            final int number = i;
            Callable<Integer> task = () -> {
                // Simulate some work
                Thread.sleep(500);
                return number * number; // return square
            };

            Future<Integer> future = executor.submit(task);
            futures.add(future);
        }

        // Retrieve and print results
        for (int i = 0; i < futures.size(); i++) {
            Integer result = futures.get(i).get(); // blocking call
            System.out.println("Square of " + (i + 1) + " is: " + result);
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
