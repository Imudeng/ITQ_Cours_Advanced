package stream_api.lesson_26_change_stream.abstract_method.sorted_comparator;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(-2,4,0,5,-5,3,-1,1);

        List<Integer> result = list.stream()
                .sorted((a,b)->Math.abs(a)-Math.abs(b))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
