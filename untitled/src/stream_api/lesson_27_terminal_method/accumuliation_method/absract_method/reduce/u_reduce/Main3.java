package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.u_reduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        Predicate<Integer> predicate = a -> a % 2 == 0;
        BiFunction<Boolean, Integer, Boolean> biFun = (a, b) -> a && predicate.test(b);
        BinaryOperator<Boolean> binaryOperator = (a, b) -> a && b;
        Boolean identity = true;
        Boolean allMathc = list.stream().reduce(identity, biFun, binaryOperator);
        System.out.println(allMathc);

        List<Integer> list1 = List.of(1, 2, 3, 4);
        Predicate<Integer> predicate1 = a -> a % 2 == 0;
        BiFunction<Boolean, Integer, Boolean> biFun1 = (a, b) -> a || predicate1.test(b);
        BinaryOperator<Boolean> binaryOperator1 = (a, b) -> a || b;
        Boolean identity1 = false;
        Boolean anyMathc = list1.stream().reduce(identity1, biFun1, binaryOperator1);
        System.out.println(anyMathc);
    }
}
