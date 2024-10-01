package default_method.take_while;

import java.util.List;

public class Main { public static void main(String[] args) {
    List<Integer> list = List.of(0,5,-7,6,4,1,6);
    list.stream()

            .takeWhile(n->n>=0)
            .forEach(n-> System.out.println(n));
}
}

