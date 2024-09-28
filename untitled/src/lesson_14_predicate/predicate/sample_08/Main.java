package lesson_14_predicate.predicate.sample_08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Anna","Ira","Kira","Kristina"));
        Predicate<String> predicate = Predicate.isEqual("Anna");
        names.removeIf(predicate);
        System.out.println(names);
    }
}
