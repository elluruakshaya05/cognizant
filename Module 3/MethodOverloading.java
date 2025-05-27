public class MethodOverloading {
    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();

        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of two doubles: " + calc.add(3.5, 2.5));
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3));
    }
}

