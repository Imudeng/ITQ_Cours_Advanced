package stream_api.lesson_25_change_stream.static_method.empty;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.empty();
        stream.forEach(n-> System.out.println(n));
    }
}
