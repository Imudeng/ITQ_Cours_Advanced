package functional_intefaces.lesson_19_consumer.and_then.simple;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cons1 = a -> System.out.println(a);
        Consumer<String> cons2 = a -> System.out.println("ta kotoraya use");
        Consumer<String> result = cons1.andThen(cons2);
        result.accept("Hello");
    }
}

