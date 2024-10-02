package lesson_05_anonymos_inner_class;

import java.util.Arrays;
import java.util.Comparator;

public class DoubleAnonymosClassStatic {
    public static void main(String[] args) {
        String[] word = {"Hello", "Cat", "Home", "Student"};
        Comparator<String> comparator = new Comparator<String>() /** анонимный класс **/
        {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Comparator<String> comparator1 = null;
        try {
            comparator1 = comparator.getClass().newInstance();
        } catch (InstantiationException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(comparator1 == comparator);
    }
}