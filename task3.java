package lambdaTasksEasy;

import java.util.List;
import java.util.function.Predicate;

public class task3 {
    public static void printAgeForAdults(List<Integer> adults,Predicate<Integer> predicate) {
        for (Integer x : adults) {
            if (predicate.test(x)) {
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> adults = List.of(12,27,36,17,68,35,9,16);
        Predicate<Integer> age = x -> x >= 18;
        printAgeForAdults(adults,age);
    }
}
