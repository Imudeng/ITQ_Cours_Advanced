package functional_intefaces.lesson_20_unary_operation.aplly.witch_liambda;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> un1 = (a) -> -a;
        UnaryOperator<Integer> un2 = Main::negative;
        System.out.println(un1.apply(3));
        System.out.println(un2.apply(-3));
    }
    public static Integer negative(Integer number) {
        return -number;
    }
}
