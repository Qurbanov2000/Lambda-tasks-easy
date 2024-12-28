package lambdaTasksEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task7 {
    public static void main(String[] args) {
        Predicate <String> checkUsername = name -> name.length() > 5;
        List<String> usernames = new ArrayList<>();
        usernames.add("Ali");
        usernames.add("Nurlan");
        usernames.add("Sexavet");
        usernames.add("Adil");
        for (String name : usernames) {
            if (checkUsername.test(name))
                System.out.println(name);
        }
    }
}
