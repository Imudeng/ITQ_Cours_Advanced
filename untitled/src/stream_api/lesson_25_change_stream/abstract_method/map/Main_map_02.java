package stream_api.lesson_25_change_stream.abstract_method.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_map_02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kot", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("kotik", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4};
        List<String> result = Arrays.stream(cats)
                .filter(n -> n.getAge() < 5)
                .map(n -> n.getName())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}