package functional_intefaces.lesson_15_function.biFunction.apply;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<String, Character, Integer> countLetter = Main::count;
        System.out.println(countLetter.apply("Hello", 'l'));
    }

    public static Integer count(String letter, Character l) {
        int result = 0;
        char[] ls = letter.toCharArray();
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] == l) {
                result++;
            }
        }
        return result;
    }
}
