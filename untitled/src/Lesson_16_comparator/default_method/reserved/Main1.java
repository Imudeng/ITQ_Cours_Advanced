package Lesson_16_comparator.default_method.reserved;

import Lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {
    public static  void main(String[] args) {
        Lesson_16_comparator.default_method.then_comparing.Cat cat1 = new Lesson_16_comparator.default_method.then_comparing.Cat("Boris", 5);
        Lesson_16_comparator.default_method.then_comparing.Cat cat2 = new Lesson_16_comparator.default_method.then_comparing.Cat("Zefir", 15);
        Lesson_16_comparator.default_method.then_comparing.Cat cat3 = new Lesson_16_comparator.default_method.then_comparing.Cat("Vasia", 3);
        Lesson_16_comparator.default_method.then_comparing.Cat cat4 = new Lesson_16_comparator.default_method.then_comparing.Cat("Fenia", 2);
        Lesson_16_comparator.default_method.then_comparing.Cat cat5 = new Lesson_16_comparator.default_method.then_comparing.Cat("Masha", 7);

        Lesson_16_comparator.default_method.then_comparing.Cat[] cats = new Lesson_16_comparator.default_method.then_comparing.Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<Lesson_16_comparator.default_method.then_comparing.Cat> comp2 = Main1::catAgeCompare;
        Comparator<Lesson_16_comparator.default_method.then_comparing.Cat> reversedComp = comp2.reversed();
        Arrays.sort(cats, reversedComp);
        for (Lesson_16_comparator.default_method.then_comparing.Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static int catAgeCompare (Lesson_16_comparator.default_method.then_comparing.Cat a, Cat b) {
            if (a.getAge() > b.getAge()) {
                return 1;
            }
            if (a.getAge()< b.getAge()){
                return -1;
            }
            return 0;
        }
      }
