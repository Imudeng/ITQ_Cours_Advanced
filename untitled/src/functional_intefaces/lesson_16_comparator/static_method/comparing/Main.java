package functional_intefaces.lesson_16_comparator.static_method.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Cat> comp1 = (a, b) -> Integer.compare(a.getAge(), b.getAge());
        Function<Cat, String> fun = a -> a.getName();
        Comparator<Cat> resultComp = comp1.thenComparing(fun);
        Arrays.sort(cats, resultComp);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
