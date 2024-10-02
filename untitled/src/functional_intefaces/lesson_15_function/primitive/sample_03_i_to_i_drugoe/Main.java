package functional_intefaces.lesson_15_function.primitive.sample_03_i_to_i_drugoe;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main (String[] args) {
        DoubleToIntFunction fun = Main:: convert;
        System.out.println(fun.applyAsInt(1.99));
    }
    public static int convert(double num) {
        return(int) num;
    }
}
