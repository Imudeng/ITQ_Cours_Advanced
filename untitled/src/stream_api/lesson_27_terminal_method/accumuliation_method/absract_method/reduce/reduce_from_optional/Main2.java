package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.reduce_from_optional;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main2 {
    public static void main(String[] args) {
        List<String> worlds = List.of("Java","Fortran","Python","C++");
        BinaryOperator<String> bop = (a,b) -> a.length()>b.length() ? a : b;
        Optional<String> result = worlds.stream().reduce(bop);
        System.out.println(result.get());
    }
}
