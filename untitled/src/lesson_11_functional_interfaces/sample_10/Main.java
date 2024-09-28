package lesson_11_functional_interfaces.sample_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Hello","world"};
        changeStringArray(array,String::toUpperCase);
        System.out.println(Arrays.toString(array));
    }
    public static void changeStringArray (String[] array,StringModificationFunction stringModificationFunction){
        for (int i=0; i<array.length; i++){
            array[i] = stringModificationFunction.modification(array[i]);
        }
    }
}
