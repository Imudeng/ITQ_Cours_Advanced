package lesson_15_function.primitive.sample_01_prinamayushie;

import java.util.Date;
import java.util.function.LongFunction;

public class Main {
    public static void main(String[] args) {
        LongFunction<Date> fun1 = a-> new Date(a);
        System.out.println(fun1.apply(4_00_000_000_000L));
    }
}
