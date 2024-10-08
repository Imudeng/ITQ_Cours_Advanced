package stream_api.lesson_27_terminal_method.abstract_method.boolean_method.all_match;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> projectLanguages = List.of("Java", "Fortran", "C", "C++", "Python", "Ruby", "JS");
        List<String> iKnow = List.of("Java", "Fortran", "C", "Python");
        Predicate<String> predicate = check(iKnow);
        if (projectLanguages.stream().anyMatch(predicate)) {
            System.out.println("I can implement part of the task");
        } else {
            System.out.println("I can help");
        }
        if (projectLanguages.stream().allMatch(predicate)) {
            System.out.println("I can impplement the whole task");
        } else {
            System.out.println("I cannot complete the whole task");

        }
    }
    public static <T> Predicate<T> check(List<T> list) {
        class CheckLanguage implements Predicate<T> {
            @Override
            public boolean test (T t) {
                for (T element : list) {
                    if (element.equals(t)) {
                        return true;
                    }
                }
                return false;
            }

        }
        return new CheckLanguage();
    }
}

