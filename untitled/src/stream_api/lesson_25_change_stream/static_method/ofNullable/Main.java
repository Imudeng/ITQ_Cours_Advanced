package stream_api.lesson_25_change_stream.static_method.ofNullable;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.ofNullable("Hello");
        stream1.forEach(n-> System.out.println(n));
        Stream<String> stream2 = Stream.ofNullable(null);
        stream2.forEach(n-> System.out.println(n));
    }
}
