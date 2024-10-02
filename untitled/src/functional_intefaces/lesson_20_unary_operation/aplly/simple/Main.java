package functional_intefaces.lesson_20_unary_operation.aplly.simple;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = new UnaryOperator1();
        System.out.println(unaryOperator.apply("Hello World"));
            }
        }
        class UnaryOperator1 implements java.util.function.UnaryOperator<String> {
    @Override
            public String apply(String t) {
        return t.toLowerCase();
    }
}
