package functional_intefaces.lesson_22_supplier.primitive;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        IntSupplier intSupplier = new RandomGenerator(10,20);
        int[] array = new int[10];
        for (int i = 0; i< array.length; i++) {
            array[i] = intSupplier.getAsInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
 class RandomGenerator implements IntSupplier {
    private int min;
    private int max;

    public RandomGenerator (int min, int max) {
        this.min = min;
        this.max = max;
    }
    @Override
     public int getAsInt() {
        return(int) (min+Math.random()*(max-min));
    }
 }