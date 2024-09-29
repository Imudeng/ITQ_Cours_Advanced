package lesson_16_predicate.primitive_predicate.sample_11;

import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate iP = a -> a % 2 == 0;
        System.out.println(iP.test(100));
    }
}
