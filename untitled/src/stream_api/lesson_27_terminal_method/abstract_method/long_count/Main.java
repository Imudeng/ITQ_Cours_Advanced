package stream_api.lesson_27_terminal_method.abstract_method.long_count;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(0,8,4,5,6,7);
        Stream<Integer> stream = numbers.stream().filter(n->n%2==1);
        long odd = stream.count();
        System.out.println(odd);
    }
}
