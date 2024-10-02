package stream_api.lesson_25_change_stream.abstract_method.flat_map.primitive_strream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_integer_flat_map {
    public static void main(String[] args) {
        String[] array = new String[] {"C","Java","Fortran"};
        IntStream stream = Arrays.stream(array).flatMapToInt(n->n.codePoints());
        stream.forEach(n-> System.out.println(n));
    }
}
