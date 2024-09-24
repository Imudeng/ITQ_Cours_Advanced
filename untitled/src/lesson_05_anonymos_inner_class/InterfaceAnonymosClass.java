package lesson_05_anonymos_inner_class;

import java.util.Arrays;
import java.util.Comparator;

public class InterfaceAnonymosClass {
    public static void main(String[] args) {
        String [] word = {"Hello", "Cat", "Home", "Student"};
        Comparator<String> comparator = new Comparator<String>()
        /** анонимный класс **/
        {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(word, comparator);
        System.out.println(Arrays.toString(word));
        // получим имя анонимного класса в статическом методе
        System.out.println(comparator.getClass().getName());
    }

}
