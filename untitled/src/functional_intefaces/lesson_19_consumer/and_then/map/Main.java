package functional_intefaces.lesson_19_consumer.and_then.map;

import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map1 = Map.of(1,"one",2,"two",3,"four");
        BiConsumer<Integer,String> biConsumer = (a,b) -> System.out.println((b+" ").repeat(a));
        map1.forEach(biConsumer);
    }
}
