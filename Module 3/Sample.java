public class Sample {
    private String name;

    public Sample(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Sample s = new Sample("Cognizant");
        s.greet();
    }
}
