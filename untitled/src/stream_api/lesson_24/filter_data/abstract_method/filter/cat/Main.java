package stream_api.lesson_24.filter_data.abstract_method.filter.cat;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Boris", 5);
    Cat cat2 = new Cat("Zefir", 15);
    Cat cat3 = new Cat("Vasia", 3);
    Cat cat4 = new Cat("Fenia", 2);
    Cat cat5 = new Cat("Masha", 7);
    Cat[] cats = new Cat[]{cat1, cat2, null, cat4, cat5};
    Stream<Cat> catToName = Arrays.stream(cats).filter(Objects::nonNull).filter(a -> a.getAge() > 5);//

    try {
        List<Cat> result = catToName.collect(Collectors.toList());
        System.out.println(result);
    } catch (NullPointerException e) {
        System.out.println(e);
    }
}

}
