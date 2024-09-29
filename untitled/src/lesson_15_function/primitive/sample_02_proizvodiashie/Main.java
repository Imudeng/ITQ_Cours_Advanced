package lesson_15_function.primitive.sample_02_proizvodiashie;

import java.util.function.ToIntFunction;

public class Main {
    public static void main (String[] args) {
        ToIntFunction<String> fun = a->a.hashCode();
        System.out.println(fun.applyAsInt("Hello"));
    }
}
