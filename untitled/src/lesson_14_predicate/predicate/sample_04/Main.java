package lesson_14_predicate.predicate.sample_04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-2, 2, 3, 4, 0));
        Predicate<Integer> predicate1 = Main::test1;
        Predicate<Integer> predicate2 = Main::test2;

        numbers.removeIf(predicate1.and(predicate2));
        System.out.println(numbers);

    }

    public static boolean test1(Integer n) {
        return n < 0;
    }

    public static boolean test2(Integer n) {
        return n % 2 == 0;
    }
}
