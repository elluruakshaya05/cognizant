import java.lang.reflect.*;

public class ReflectDemo {
    public static void main(String[] args) {
        try {
            // Load the class dynamically
            Class<?> personClass = Class.forName("Person1");

            // Print declared methods
            System.out.println("Declared Methods:");
            for (Method method : personClass.getDeclaredMethods()) {
                System.out.println(method.getName());
            }

            // Create a new instance of Person
            Object personInstance = personClass.getDeclaredConstructor().newInstance();

            // Call setName("Reflection User")
            Method setName = personClass.getMethod("setName", String.class);
            setName.invoke(personInstance, "Reflection User");

            // Call sayHello()
            Method sayHello = personClass.getMethod("sayHello");
            sayHello.invoke(personInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
