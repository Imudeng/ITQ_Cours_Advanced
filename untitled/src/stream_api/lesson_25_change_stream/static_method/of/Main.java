package stream_api.lesson_25_change_stream.static_method.of;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Hello","World");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
