package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task12 {
    public static void filterPositiveNumbers(List<Integer> numbers) {
        Predicate<Integer> isPositive = number -> number >= 0;
        numbers.stream().filter(isPositive).forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -2, 3, 4, -5, 6, -7, 8, 9, -10));
        filterPositiveNumbers(list);
    }
}
