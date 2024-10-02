package stream_api.lesson_27_terminal_method.collect.from_supplier;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4);
        List<Integer> even = list.stream()
                .filter(a->a%2==0)
                .collect(ArrayList::new, (a,b)->a.add(b),(a,b)->a.addAll(b));
        System.out.println(even);
    }
}
