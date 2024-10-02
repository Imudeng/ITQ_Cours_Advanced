package stream_api.lesson_25_change_stream.abstract_method.map;

import java.util.List;
import java.util.stream.Stream;

public class Main_map {
    public static void main(String[] args) {
        List<String> list = List.of("Java","Python","C");
        Stream<Integer> stream = list.stream().map(n->n.length());
        stream.forEach(n-> System.out.println(n));
    }
}
