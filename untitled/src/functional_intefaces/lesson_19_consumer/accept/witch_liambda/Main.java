package functional_intefaces.lesson_19_consumer.accept.witch_liambda;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> cons1 = (a) -> System.out.println(a);
        Consumer<String> cons2 = Main::simpePrinter;
        cons1.accept("Hello world");
        cons1.accept("Hello World");
    }

    public static <T> void simpePrinter(T operand) {
        System.out.println(operand);
    }
}

