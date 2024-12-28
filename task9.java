package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task9 {
    public static void print(List<String> list) {
        Predicate<String> predicate = s -> s.length() >= 5;
        for (String s : list)
            if (predicate.test(s))
                System.out.println(s);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Ali","Akif","Sahib","Nurlan","Elcin"));
        print(list);
    }
}
