package functional_intefaces.abstract_method.void_sort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris", 5);
        Cat cat2 = new Cat("Zefir", 15);
        Cat cat3 = new Cat("Vasia", 3);
        Cat cat4 = new Cat("Fenia", 5);
        Cat cat5 = new Cat("Masha", 7);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        System.out.println();
        Arrays.sort(cats);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }
}
