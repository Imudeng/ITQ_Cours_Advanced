package stream_api.lesson_26_change_stream.abstract_method.unordered;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of("A1","B1","C1");

        Stream<String> stream = list1.stream()
                .unordered();// комплятор не видит смысла менять порядок, т.к. никакого прироста нигде не будет

        stream.forEach(n-> System.out.println(n));
    }
}

