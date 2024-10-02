package functional_intefaces.lesson_20_unary_operation.primitive.default_method.and_then;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        IntUnaryOperator un1 = a->a+1;
        IntUnaryOperator un2 = a->2*a;
        IntUnaryOperator result = un1.andThen(un2);
        System.out.println(result.applyAsInt(3));
    }
}
