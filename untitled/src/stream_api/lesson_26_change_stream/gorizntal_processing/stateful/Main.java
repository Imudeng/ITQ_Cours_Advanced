package stream_api.lesson_26_change_stream.gorizntal_processing.stateful;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of("a1","c1","b1");
        Stream<String> stream = list1.stream()
                .sorted((a,b)-> {
                    System.out.println("Sorted "+a+" "+b);
                    return a.compareTo(b);
                })
                .filter(n->{
                    System.out.println("Filter" +n);
                    return n.startsWith("b");
                })
                .map(n->{
                    System.out.println("Map "+ n);
                    return "_"+n;
                });
        stream.forEach(n-> System.out.println("forEach"+n));

    }
}
