package lesson_14_predicate.bi_predicate.sample_10;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate1 = (a, b) ->a.length()<b+3;
        BiPredicate<String, Integer> biPredicate2 = (a,b) ->a.length()>b-3;
        String text = "Hello";
        System.out.println(biPredicate1.and(biPredicate2).test(text,3));
    }
}

