import java.util.List;

public class limit {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,5,-7,6,4,1,6);
        list.stream()
                .filter(n->n>=0)
                .sorted()
                .limit(3)
                .forEach(n-> System.out.println(n));
    }
}
