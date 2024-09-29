package lesson_16_predicate.predicate.sample_06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-2, 2, 3, 4, 0));
        Predicate<Integer> predicate1 = Main::test1;


        numbers.removeIf(predicate1.negate());
        System.out.println(numbers);

    }

    public static boolean test1(Integer n) {
        return n > 0;
    }


}
