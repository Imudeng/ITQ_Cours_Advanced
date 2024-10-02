package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.reduce_from_optional;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        BinaryOperator<Integer> bop = (a,b) -> a+b;
        Optional<Integer> sum = list.stream()
                .filter(a->a%2==0)
                .reduce(bop);
        System.out.println(sum.get());
    }
}
