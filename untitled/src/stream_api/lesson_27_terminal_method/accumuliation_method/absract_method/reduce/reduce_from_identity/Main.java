package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.reduce_from_identity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("World" ,"!");
        String result = list.stream().reduce("Hello",(a,b)->a+" "+b);
        System.out.println(result);
    }
}
