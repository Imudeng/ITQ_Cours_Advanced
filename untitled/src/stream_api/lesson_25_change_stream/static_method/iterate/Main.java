package stream_api.lesson_25_change_stream.static_method.iterate;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1,n->n<=10,n->n+1);//цикл фор...ограничен условием
        stream.forEach(n-> System.out.println(n));
        Stream<String> stream1 = Stream.iterate("A", n->n+n);
        stream1.limit(15).forEach(n-> System.out.println(n));

    }
}
