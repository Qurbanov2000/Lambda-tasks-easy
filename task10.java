package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class task10 {
    public static void logUserActivities(List<String> list) {
        Consumer<String> consumer = s -> System.out.println("Activity: " + s);
        list.forEach(consumer);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("User logged in",
                "User viewed profile",
                "User updated settings",
                "User Logged out")
        );
        logUserActivities(list);
    }
}
