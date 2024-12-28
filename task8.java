package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task8 {
    public static void printSquare(List<Integer> list) {
        Consumer<Integer> consumer = x -> System.out.println(x*x);
        list.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printSquare(list);
    }
}
