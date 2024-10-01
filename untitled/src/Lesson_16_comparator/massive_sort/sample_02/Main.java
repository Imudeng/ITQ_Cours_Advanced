package Lesson_16_comparator.massive_sort.sample_02;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {5,0,-3,2,-1,4};
        Comparator<Integer> comparator = (a,b) -> Math.abs(a)-Math.abs(b);
        Arrays.sort(array, comparator);
        System.out.println(Arrays.toString(array));
    }
}
