package functional_intefaces.lesson_16_comparator.static_method.natural_reverse_order;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list1 = List.of(5, 7, -2, 3, 8);
        Comparator<Integer> comp = Comparator. < Integer > naturalOrder();
        Integer min = Collections.min(list1, comp);
        System.out.println(min);
    }
}



