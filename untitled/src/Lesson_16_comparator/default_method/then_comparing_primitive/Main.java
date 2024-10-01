package Lesson_16_comparator.default_method.then_comparing_primitive;

import Lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.*;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
        cats.add(null);
        Comparator<Cat> comp1 = (a, b) -> Integer.compare(a.getAge(), b.getAge());
        Comparator<Cat> resultComp = Comparator.nullsLast(comp1);
        Cat minAgeCat = Collections.min(cats, resultComp);
        System.out.println(minAgeCat);
    }
}



