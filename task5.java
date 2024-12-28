package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task5 {
    public static void printAllStringUpperCase(List<String> list) {
        Consumer <String> consumer = x -> System.out.println(x.toUpperCase());
        list.forEach(consumer);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ALi");
        list.add("Nurlan");
        list.add("Samir");
        list.add("Elvin");
        printAllStringUpperCase(list);

    }
}
