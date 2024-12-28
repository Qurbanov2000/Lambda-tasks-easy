package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;

public class task14 {
    @FunctionalInterface
    interface Formatter {
        String format(String s);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Formatter formatter = s -> {
          String[] split = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                sb.append(split[i].substring(0, 1).toUpperCase())
                .append(split[i].substring(1, split[i].length()))
                .append(" ");
            }
            return sb.toString();
        };
        list.add("hello ingress academy");
        list.add("java is the best");
        for (String s : list)
            System.out.println(formatter.format(s));

    }
}
