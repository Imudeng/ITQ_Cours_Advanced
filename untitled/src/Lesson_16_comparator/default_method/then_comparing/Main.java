package Lesson_16_comparator.default_method.then_comparing;

import Lesson_16_comparator.default_method.reserved.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Lesson_16_comparator.default_method.reserved.Cat cat1 = new Lesson_16_comparator.default_method.reserved.Cat("Boris", 5);
        Lesson_16_comparator.default_method.reserved.Cat cat2 = new Lesson_16_comparator.default_method.reserved.Cat("Zefir", 15);
        Lesson_16_comparator.default_method.reserved.Cat cat3 = new Lesson_16_comparator.default_method.reserved.Cat("Vasia", 3);
        Lesson_16_comparator.default_method.reserved.Cat cat4 = new Lesson_16_comparator.default_method.reserved.Cat("Fenia", 2);
        Lesson_16_comparator.default_method.reserved.Cat cat5 = new Lesson_16_comparator.default_method.reserved.Cat("Masha", 7);

        Lesson_16_comparator.default_method.reserved.Cat[] cats = new Lesson_16_comparator.default_method.reserved.Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Lesson_16_comparator.default_method.reserved.Cat> comp1 = (a, b) -> Integer.compare(a.getAge(), b.getAge());
        Comparator<Lesson_16_comparator.default_method.reserved.Cat> comp2 = (a, b) -> a.getName().compareTo(b.getName());

        Comparator<Lesson_16_comparator.default_method.reserved.Cat> comp3 = comp1.thenComparing(comp2);
        Arrays.sort(cats, comp3);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}