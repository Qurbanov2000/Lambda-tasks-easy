package lambdaTasksEasy;


public class task11 {
    @FunctionalInterface
    interface Calculator {
       int calc(int a, int b);
    }
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a+b;
        Calculator subtraction = (a,b) -> a-b;
        Calculator multiplication = (a,b) -> a*b;
        Calculator division = (a,b) -> {
            if (b==0) throw new ArithmeticException("Division by zero is impossible");
            return a/b;
        };
        addition.calc(12,6);
        subtraction.calc(12,6);
        multiplication.calc(12,6);
        division.calc(12,6);
    }
}
