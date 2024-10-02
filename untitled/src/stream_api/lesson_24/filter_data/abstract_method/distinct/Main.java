package stream_api.lesson_24.filter_data.abstract_method.distinct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,1,5,-2,3,1);
        list.stream().distinct().forEach(n-> System.out.println(n));
    }
}
