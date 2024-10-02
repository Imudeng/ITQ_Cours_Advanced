package functional_intefaces.lesson_15_function.apply.sample_01;


import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun = new StrToLeng();
        System.out.println(fun.apply("Hello"));

    }
}

class StrToLeng implements Function<String, Integer> {
    @Override
    public Integer apply(String t) {
        return t.length();
    }
}
