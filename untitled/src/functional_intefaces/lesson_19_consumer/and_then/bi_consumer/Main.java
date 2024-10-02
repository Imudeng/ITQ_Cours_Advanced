package functional_intefaces.lesson_19_consumer.and_then.bi_consumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =(a,b) -> System.out.println(a.repeat(b));
        biConsumer.accept("Hello",3);
    }
}
