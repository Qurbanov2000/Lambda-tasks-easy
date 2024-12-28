package lambdaTasksEasy;

import java.util.List;
import java.util.function.Predicate;

public class task15 {
    public static void printPolindrome(List<String> list) {

        Predicate<String> predicate = s -> {
          int i;
            for (i = 0; i < s.length()/2; i++)
                if (s.charAt(i) != s.charAt(s.length()-i-1)) break;
            if (i == s.length()/2) return true;
            return false;
        };

        for (String s : list)
            if (predicate.test(s))
                System.out.println(s);

    }
    public static void main(String[] args) {
        List<String> list = List.of("deed","wow","bird","human","rotator");
        printPolindrome(list);
    }
}
