package functional_intefaces.lesson_20_unary_operation.default_method.compose;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun = a-> a.length();
        UnaryOperator<Integer> unaryOperator = a->2*a;
        Function<String,Integer> result = unaryOperator.compose(fun);
        System.out.println(result.apply("hello"));
    }
}
