
import functional_intefaces.lesson_14_predicate.predicate.sample_01.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//       predicate.sample_01.Cat cat1 = new lesson_16_predicate.predicate.sample_01.Cat("Boris", 5);
//        predicate.sample_01.Cat cat2 = new lesson_16_predicate.predicate.sample_01.Cat("Zefir", 15);
//        lesson_16_predicate.predicate.sample_01.Cat cat3 = new lesson_16_predicate.predicate.sample_01.Cat("Vasia", 3);
//        lesson_16_predicate.predicate.sample_01.Cat cat4 = new lesson_16_predicate.predicate.sample_01.Cat("Fenia", 2);
//        lesson_16_predicate.predicate.sample_01.Cat cat5 = new lesson_16_predicate.predicate.sample_01.Cat("Masha", 7);
//        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
//        CatAgeComparator comp = new CatAgeComparator();
//        System.out.println(comp.compare(cat1, cat2) == -comp.compare(cat2, cat1));
//        System.out.println(comp.compare(cat1, cat2) > 0 && comp.compare(cat2, cat5) > 0 && comp.compare(cat1, cat5) > 0);
//        System.out.println(comp.compare(cat2, cat4) == 0 && (comp.compare(cat2, cat1) < 0 && comp.compare(cat4, cat1) < 0));
//
//
//    }


//class CatAgeComparator implements Comparator<Cat> {
//    public int compare(Cat o1, Cat o2) {
//        if (o1.getAge() > o2.getAge()) {
//            return 1;
//        }
//        if (o1.getAge() < o2.getAge()) {
//            return -1;
//        }
//        return 0;
//    }
//}
