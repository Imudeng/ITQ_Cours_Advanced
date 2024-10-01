package Lesson_16_comparator.static_method.natural_reverse_order;

import Lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import static java.util.Comparator.naturalOrder;

public class Main {
    public static void main(String[] args) {


        List<Integer> list1 = List.of(5, 7, -2, 3, 8);
        Comparator<Integer> comp = Comparator. < Integer > naturalOrder();
        Integer min = Collections.min(list1, comp);
        System.out.println(min);
    }
}



