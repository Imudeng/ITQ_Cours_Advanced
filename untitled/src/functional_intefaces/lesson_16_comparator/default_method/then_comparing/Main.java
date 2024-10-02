package functional_intefaces.lesson_16_comparator.default_method.then_comparing;

import functional_intefaces.lesson_16_comparator.default_method.reserved.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat cat1 = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat("Boris", 5);
        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat cat2 = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat("Zefir", 15);
        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat cat3 = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat("Vasia", 3);
        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat cat4 = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat("Fenia", 2);
        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat cat5 = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat("Masha", 7);

        functional_intefaces.lesson_16_comparator.default_method.reserved.Cat[] cats = new functional_intefaces.lesson_16_comparator.default_method.reserved.Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<functional_intefaces.lesson_16_comparator.default_method.reserved.Cat> comp1 = (a, b) -> Integer.compare(a.getAge(), b.getAge());
        Comparator<functional_intefaces.lesson_16_comparator.default_method.reserved.Cat> comp2 = (a, b) -> a.getName().compareTo(b.getName());

        Comparator<functional_intefaces.lesson_16_comparator.default_method.reserved.Cat> comp3 = comp1.thenComparing(comp2);
        Arrays.sort(cats, comp3);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}