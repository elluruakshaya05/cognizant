public class TypeCasting {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;  // Explicit casting: double to int

        int originalInt = 42;
        double castedDouble = originalInt;  // Implicit casting: int to double

        System.out.println("Original double: " + doubleValue);
        System.out.println("After casting to int: " + intValue);
        System.out.println("Original int: " + originalInt);
        System.out.println("After casting to double: " + castedDouble);
    }
}
