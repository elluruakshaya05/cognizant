public class Bytecode {
    public int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Bytecode obj = new Bytecode();
        int result = obj.square(5);
        System.out.println("Square is: " + result);
    }
}
