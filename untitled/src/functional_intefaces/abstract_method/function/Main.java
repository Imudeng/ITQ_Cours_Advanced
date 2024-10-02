package functional_intefaces.abstract_method.function;

import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> fun = a-> a.length();
        Comparator<String> comparator = Comparator.comparing(fun);
        System.out.println(comparator.compare("Java","Python"));
    }
}
