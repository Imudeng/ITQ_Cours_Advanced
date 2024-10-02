package functional_intefaces.lesson_19_consumer.accept.pobochnie_effects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class Main {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String s = "J";

    Consumer<String> cons1 = a -> {
        if (a.startsWith(s))
            result.add(a);
        };

        cons1.accept("Java");
        cons1.accept("Julia");
        cons1.accept("Python");
        System.out.println(result);
    }
}

