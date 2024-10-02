package functional_intefaces.lesson_20_unary_operation.aplly.witch_liambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        UnaryOperator<Integer> un1 = a->2*a;
        list1.replaceAll(un1);
        System.out.println(list1);
    }
}
