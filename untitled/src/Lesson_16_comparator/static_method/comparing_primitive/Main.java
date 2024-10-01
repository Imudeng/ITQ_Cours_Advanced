package Lesson_16_comparator.static_method.comparing_primitive;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        ToIntFunction<Cat> fun = a -> a.getAge();
        Comparator<Cat> resultComp = Comparator.comparingInt(fun);
        Collections.sort(cats, resultComp);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
