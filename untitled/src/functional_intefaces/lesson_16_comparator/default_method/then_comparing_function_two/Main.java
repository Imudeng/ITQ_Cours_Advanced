package functional_intefaces.lesson_16_comparator.default_method.then_comparing_function_two;

import functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);

        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Cat> comp1 = (a, b) -> Integer.compare(a.getAge(), b.getAge());
        Comparator<Cat> resultComp = comp1.thenComparing(Main::catToString, Main::compareStringLength);
        Arrays.sort(cats, resultComp);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static String catToString(Cat cat) {
        return cat.getName();
    }

    public static int compareStringLength(String a, String b) {
        if (a.length() > b.length()) {
            return 1;
        }
        if (a.length() < b.length()) {
            return -1;
        }
        return 0;
    }
}
