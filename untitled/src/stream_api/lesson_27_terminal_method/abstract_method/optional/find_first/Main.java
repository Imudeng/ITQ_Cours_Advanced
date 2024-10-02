package stream_api.lesson_27_terminal_method.abstract_method.optional.find_first;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(0,8,9,4,5,7);
        Stream<Integer> stream = numbers.stream().filter(n->n%2 ==1);
        Optional<Integer> result = stream.findFirst();
        System.out.println(result.get());
    }
}
