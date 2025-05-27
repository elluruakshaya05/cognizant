public class VirtualThreadDemo {
    public static void main(String[] args) {
        System.out.println("Starting 100,000 virtual threads...");

        for (int i = 0; i < 100_000; i++) {
            int threadNumber = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread #" + threadNumber);
            });
        }

        // Give time for threads to finish (or join them properly)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All virtual threads started.");
    }
}
