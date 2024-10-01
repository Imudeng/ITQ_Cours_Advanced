import java.util.List;

public class skip {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,5,-7,6,4,1,6);
        list.stream()
                .filter(n->n>=0)
                .sorted()
                .skip(4)
                .forEach(n-> System.out.println(n));
    }
}

