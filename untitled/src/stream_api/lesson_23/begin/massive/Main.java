package stream_api.lesson_23.begin.massive;

import functional_intefaces.lesson_14_predicate.predicate.sample_01.Cat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        List<Cat> list = List.of(
            cat1, cat2, cat3, cat4, cat5
        ) ;
        Stream<Cat> catStream = list.stream().filter(a -> a.getName().length() > 5);
        List<Cat> result = catStream.collect(Collectors.toList());
        System.out.println(result);
    }
}