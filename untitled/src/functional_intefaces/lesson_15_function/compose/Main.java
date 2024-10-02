package functional_intefaces.lesson_15_function.compose;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> fun1 = a -> a.replaceAll("[^A-Za-z]", "");
        Function<String, Integer> fun2 = a -> a.length();
        Function<String, Integer> fun3 = fun2.compose(fun1);
        String text = "Hello world 1234,621, a 15";
        System.out.println(fun3.apply(text));
    }
}

