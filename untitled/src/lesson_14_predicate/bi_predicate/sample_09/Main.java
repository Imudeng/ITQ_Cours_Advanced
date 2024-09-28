package lesson_14_predicate.bi_predicate.sample_09;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPred = (a,b) ->a.length()>b;
        System.out.println(biPred.test("Hello",10));
    }
}
