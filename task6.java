package lambdaTasksEasy;

public class task6 {
    @FunctionalInterface
    interface Greeter {
        void greet(String name);
    }
    public static void main(String[] args) {
        Greeter greeter = name -> System.out.println("Hello " + name);
        greeter.greet("Ali");
        greeter.greet("Akif");
        greeter.greet("Nurlan");

    }
}
