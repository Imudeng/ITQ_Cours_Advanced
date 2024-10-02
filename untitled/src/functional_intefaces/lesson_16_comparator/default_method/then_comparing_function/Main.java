package functional_intefaces.lesson_16_comparator.default_method.then_comparing_function;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        Function<Cat, String> func = (a) -> a.getName();
        Comparator<String> comp = (a, b) -> a.compareTo(b);
        Comparator<Cat> resultComp = Comparator.comparing(func, comp);
        Cat minAgecat = Collections.min(cats, resultComp);
        System.out.println(minAgecat);
    }
}


