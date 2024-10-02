package functional_intefaces.lesson_16_comparator.static_method.min_max;

import functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Cat> comp1 = (a, b) -> a.getName().compareTo(b.getName());
        ToIntFunction<Cat> fun = a -> a.getAge();
        Comparator<Cat> resultComp = comp1.thenComparingInt(fun);
        Arrays.sort(cats, resultComp);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}


