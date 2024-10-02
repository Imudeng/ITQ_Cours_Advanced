package stream_api.lesson_25_change_stream.static_method.generate;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(getRandomNumber(7,5));
        List<Integer> list = stream.limit(10).collect(Collectors.toList());
        System.out.println(list);

    }
    public static Supplier<Integer> getRandomNumber(int start,int end) {//что это
        class RandGen implements Supplier<Integer>{
            @Override
            public Integer get() {
                return (int) (start+ Math.random()*(end - start)+1);
            }
        }
        return new RandGen();//что это
    }

}
