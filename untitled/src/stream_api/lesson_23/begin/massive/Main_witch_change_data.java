package stream_api.lesson_23.begin.massive;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_witch_change_data {
    public static void main(String[] args) {
    Cat cat1 = new Cat("Boris", 5);
    Cat cat2 = new Cat("Zefir", 15);
    Cat cat3 = new Cat("Vasia", 3);
    Cat cat4 = new Cat("Fenia", 2);
    Cat cat5 = new Cat("Masha", 7);
    List<Cat> list = List.of(cat1, cat2, cat3, cat4, cat5);

    int age = 5;
    Stream<String> catStream = list.stream() // создание потока данных
            .filter(a -> a.getAge() >= age) // промежуточный метод для фильтрации
            .map(a -> a.getName());// промедуточный метод для преобразования
    List<String> result = catStream.collect(Collectors.toList());

        System.out.println(result);
}
}


