package functional_intefaces.lesson_15_function.apply.sample_02;


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun1 = a -> a.length();
        System.out.println(fun1.apply("Hello"));
        Function <String, Integer> fun2 = String::length;
        System.out.println(fun2.apply("World"));
    }
}

class StrToLeng implements Function<String, Integer> {
    @Override
    public Integer apply(String t) {
        return t.length();
    }
}
