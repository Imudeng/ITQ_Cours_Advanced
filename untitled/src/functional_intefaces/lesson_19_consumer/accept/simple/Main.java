package functional_intefaces.lesson_19_consumer.accept.simple;

import java.util.function.Consumer;

public class Main {
        public static void main(String[] args) {
            Consumer<String> cons1 = new HashCodePrinter<>();
            cons1.accept("Hello");
        }
    }

    class HashCodePrinter<T> implements Consumer<T> {
        @Override
        public void accept(T t) {
            System.out.println(t.hashCode());
        }
    }

