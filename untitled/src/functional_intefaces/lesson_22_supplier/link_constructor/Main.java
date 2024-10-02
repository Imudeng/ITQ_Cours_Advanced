package functional_intefaces.lesson_22_supplier.link_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<List<String>> sup1 = ArrayList::new;
        List<String> list = sup1.get();
        System.out.println(list);
    }
}
