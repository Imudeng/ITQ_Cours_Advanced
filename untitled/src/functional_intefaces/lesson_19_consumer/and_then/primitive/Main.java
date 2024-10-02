package functional_intefaces.lesson_19_consumer.and_then.primitive;

import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        IntConsumer cons = a -> {
            if (a % 2 == 0) {
                System.out.println(a + " even");
            } else {
                System.out.println(a + " odd");
            }
        };
        cons.accept(6);
    }
}
