public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer with value: " + i);
            case String s -> System.out.println("String with value: " + s);
            case Double d -> System.out.println("Double with value: " + d);
            case null -> System.out.println("Null value");
            default -> System.out.println("Unknown type: " + obj.getClass().getName());
        }
    }

    public static void main(String[] args) {
        checkType(42);
        checkType("Hello");
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
}
