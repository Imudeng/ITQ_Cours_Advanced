package functional_intefaces.lesson_16_comparator.default_method.reserved;

import functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {
    public static  void main(String[] args) {
        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat1 = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat("Boris", 5);
        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat2 = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat("Zefir", 15);
        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat3 = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat("Vasia", 3);
        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat4 = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat("Fenia", 2);
        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat5 = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat("Masha", 7);

        functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat[] cats = new functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat[]{cat1, cat2, cat3, cat4, cat5};
        Comparator<functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat> comp2 = Main1::catAgeCompare;
        Comparator<functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat> reversedComp = comp2.reversed();
        Arrays.sort(cats, reversedComp);
        for (functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static int catAgeCompare (functional_intefaces.lesson_16_comparator.default_method.then_comparing.Cat a, Cat b) {
            if (a.getAge() > b.getAge()) {
                return 1;
            }
            if (a.getAge()< b.getAge()){
                return -1;
            }
            return 0;
        }
      }
