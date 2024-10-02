package functional_intefaces.lesson_15_function.biFunction.primitive;

import java.util.function.ToIntBiFunction;

public class Main {
    public static void main(String[] args){
        ToIntBiFunction<Character,Character> fun = (a,b) -> a+b;
        System.out.println(fun.applyAsInt('a','b'));
    }
}
