package stream_api.lesson_23.begin.massive;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_witch_exepction {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kot", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat(null, 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        List<Cat> list = List.of(cat1, cat2, cat3, cat4, cat5);

        Stream<Cat> CatToName = list.stream().filter(a -> a.getName().length() >= 5);
        try {
            List<Cat> result = CatToName.collect(Collectors.toList());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
//ничего не выводится, а в видео есть