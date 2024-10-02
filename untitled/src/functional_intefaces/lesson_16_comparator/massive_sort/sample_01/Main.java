package functional_intefaces.lesson_16_comparator.massive_sort.sample_01;

import functional_intefaces.lesson_14_predicate.predicate.sample_01.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        Cat[] cats = new Cat[] {cat1, cat2, cat3, cat4, cat5};
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
        CatAgeComparator comparator = new CatAgeComparator();
        Arrays.sort(cats,comparator);
        for (Cat cat:cats) {
            System.out.println(cat);
        }
    }
}

class CatAgeComparator implements Comparator<Cat> {
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}
