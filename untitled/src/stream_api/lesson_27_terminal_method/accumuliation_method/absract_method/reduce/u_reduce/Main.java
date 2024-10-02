package stream_api.lesson_27_terminal_method.accumuliation_method.absract_method.reduce.u_reduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Goods> list = List.of(new Goods("Apple",50),new Goods("Orange",70),
                new Goods("Pear",65),new Goods("Cherry",75));
        BiFunction<Integer, Goods,Integer> biFunction = (a,b)-> a+b.getPrice();
        BinaryOperator<Integer> binaryOperator = (a,b)-> a+b;
        Integer totalSum = list.stream().filter(a->a.getPrice()>65).reduce(0,biFunction,binaryOperator);
        System.out.println(totalSum);
    }
}
