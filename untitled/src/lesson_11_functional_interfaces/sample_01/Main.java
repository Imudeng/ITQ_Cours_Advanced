package lesson_11_functional_interfaces.sample_01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String [] args) {
        List<String> list = new ArrayList<>(List.of("Hello","Cat","Java","Bag"));
        System.out.println(list);
        list.removeIf(new Predicate<String>() { // анонимный класс
            @Override
            public boolean test(String s) {
                return s.length()>3;
            }
        });
        System.out.println(list);
    }
}
