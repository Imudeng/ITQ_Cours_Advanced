package stream_api.lesson_26_change_stream.vertical_processing.end_switch;

import java.util.List;
import java.util.stream.Stream;

public class Main_save_order_stream {
    public static void main(String[] args) {
        List<String> list1 = List.of("a1", "a2", "a3");//все элементы берутся по очереди и к ним применя.тся методы по очереди. Это называется вертикальное выполнение
        Stream<String> stream = list1.stream()
                .filter(n -> {
                    System.out.println("Filter " + n);
                    return n.length() <= 2;
                })
                .map(n -> {
                    System.out.println("Map " + n);
                    return "_" + n;
                });
        stream.forEach(n -> System.out.println("forEach" + n));

        List<String> list2 = List.of("b1", "b2", "b3");
        Stream<String> stream1 = list2.stream()
                .filter(b -> {
                    System.out.println("Filter " + b);
                    return b.endsWith("2");// чем раньше отсеим данные с потока тем лучше
                })
                .map(b -> {
                    System.out.println("Map " + b);
                    return "_" + b;
                });
        stream1.forEach(b -> System.out.println("forEach" + b));

    }
}
