package lambdaTasksEasy;

import java.util.List;
import java.util.function.Predicate;

public class task2 {
    public static void printListWithOutNonEmpty(List <String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Nurlan","Ferid","","Kamil","Akif","");
        Predicate<String> predicate = name -> !name.trim().isEmpty();
        printListWithOutNonEmpty(list, predicate);
    }
}
