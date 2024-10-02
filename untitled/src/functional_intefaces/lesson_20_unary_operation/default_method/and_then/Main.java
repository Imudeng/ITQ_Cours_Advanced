package functional_intefaces.lesson_20_unary_operation.default_method.and_then;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> un1 = a->a.strip();
        Function<String, Integer> fun = a-> a.length();
        Function<String,Integer> result = un1.andThen(fun);
        System.out.println(result.apply("   Hello   "));

    }
}
