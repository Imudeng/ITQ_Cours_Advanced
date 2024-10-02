package functional_intefaces.lesson_20_unary_operation.static_method.identity;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> un1 = UnaryOperator.identity();
        System.out.println(un1.apply(5));
    }
}
