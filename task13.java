package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task13 {
    public static void increasePercentage(List<Double> list) {
        Consumer<Double> increase = x -> x=x*1.05;
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*1.05);
        }
    }
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(12.0);
        list.add(35.0);
        list.add(100.0);
        list.add(250.0);
        increasePercentage(list);
        System.out.println(list);
    }
}
