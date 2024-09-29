package Lesson_16_comparator.massive_sort.sample_01;

import lesson_16_predicate.predicate.sample_01.Cat;

import java.util.Comparator;

public class Main_liambda {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 2);
        Cat cat5 = new Cat("Masha", 7);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Lesson_16_comparator.massive_sort.sample_01.Cat> comparator1 = (a, b) -> a.getAge() - b.getAge();
        Comparator<Lesson_16_comparator.massive_sort.sample_01.Cat> comparator2 = Main_liambda::CatAgeComparator_liambda;
    }




    public static int CatAgeComparator_liambda (Lesson_16_comparator.massive_sort.sample_01.Cat a, Lesson_16_comparator.massive_sort.sample_01.Cat b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        }
        if (a.getAge() < b.getAge()) {
            return -1;
        }
        return 0;
    }
}
