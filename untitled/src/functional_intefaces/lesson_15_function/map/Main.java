package functional_intefaces.lesson_15_function.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>(Map.of(1,"one",5,"five", 10,"ten"));
        Integer num = 2;
        String result = numbers.computeIfAbsent(num, n-> "number " + n);
        System.out.println(numbers);
        System.out.println(result);

    }
}
