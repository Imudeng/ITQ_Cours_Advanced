package stream_api.lesson_23.begin.massive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_change_object {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kot", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("kotik", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        List<Cat> list = List.of(cat1, cat2, cat3, cat4, cat5);

        Stream<Cat> catToName = list.stream().filter(a -> a.getAge() > 5).peek(a -> a.setName("Bris "+a.getName()));
        catToName.forEach(a-> System.out.println(a));
        System.out.println();
        for (Cat cat:list) {
            System.out.println(cat);
        }

    }

}
