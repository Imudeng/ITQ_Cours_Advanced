package lesson_16_predicate.primitive_predicate.sample_12;

import java.util.function.IntPredicate;

public class Main1 {
    public static void main(String[] args) {
        int[] array = new int[]{-4, 1, 6, -3, 0, 1, 7};
        int even = countElement(array, a -> a % 2 == 0);
        int odd = countElement(array, a -> a % 2 != 0);

    }


    private static int countElement(int[] array, IntPredicate iP) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (iP.test(array[i])) {
                count += 1;
            }
        }
        return count;
    }
}
