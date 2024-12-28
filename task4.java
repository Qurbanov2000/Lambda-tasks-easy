package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task4 {
    public static void applyDiscount(List<Double> prices, Consumer <List<Double>> consumer) {
        consumer.accept(prices);
    }

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(100.0);
        prices.add(200.0);
        prices.add(300.0);

        Consumer<List<Double>> consumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i)*0.9);
            }
        };
        applyDiscount(prices, consumer);
        System.out.println(prices);
    }
}
