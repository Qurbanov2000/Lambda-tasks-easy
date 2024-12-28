package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task1 {
    public static void printEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i+1);
        Predicate<Integer> p = number -> number % 2 == 0;
        printEvenNumbers(list, p);
    }
}
