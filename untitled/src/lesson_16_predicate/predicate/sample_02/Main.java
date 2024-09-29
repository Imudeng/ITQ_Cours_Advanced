package lesson_16_predicate.predicate.sample_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args) {
        Cat cat1 = new Cat("Boris",5);
        Cat car2 = new Cat("Zefir",15);
        Cat cat3 = new Cat("Vasia",3);
        Cat cat4 = new Cat("Fenia",2);
        Cat cat5 = new Cat("Masha",7);
        List<Cat> cats = new ArrayList<>(List.of(cat1,car2,cat3,cat4,cat5));
        cats.removeIf(Main::testCat);
        System.out.println(cats);

    }
    public static boolean testCat (Cat cat) {
        return cat.getAge()<6;
    }
}
