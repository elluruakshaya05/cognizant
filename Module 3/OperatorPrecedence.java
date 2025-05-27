public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;       // Multiplication before addition
        int result2 = (10 + 5) * 2;     // Parentheses alter precedence
        int result3 = 100 / 10 + 5 * 3; // Division and multiplication before addition

        System.out.println("Result 1 (10 + 5 * 2): " + result1); // 10 + 10 = 20
        System.out.println("Result 2 ((10 + 5) * 2): " + result2); // 15 * 2 = 30
        System.out.println("Result 3 (100 / 10 + 5 * 3): " + result3); // 10 + 15 = 25
    }
}
