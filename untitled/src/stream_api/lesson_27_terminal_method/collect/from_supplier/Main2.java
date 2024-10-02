package stream_api.lesson_27_terminal_method.collect.from_supplier;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goods> list = List.of(new Goods("Apple",50),
                new Goods("Orange",70),
                new Goods("Pear",65),
                new Goods("Cherry",75));

        List<String> goodsName= list.stream()
                .filter(a->a.getPrice()>50)
                .collect(ArrayList::new,(a,b)->a.add(b.getName()),(x,y)->x.addAll(y));
        System.out.println(goodsName);
    }
}
