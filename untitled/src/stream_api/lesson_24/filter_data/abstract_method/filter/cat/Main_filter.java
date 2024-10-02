package stream_api.lesson_24.filter_data.abstract_method.filter.cat;

import java.util.List;
import java.util.stream.Collectors;

public class Main_filter {
    public static void main(String[] args) {
        List<Integer> list = List.of(-1,0,-5,4,7);
        List<Integer> resultList = list.stream().filter(a->a>0).filter(a->a<7).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
