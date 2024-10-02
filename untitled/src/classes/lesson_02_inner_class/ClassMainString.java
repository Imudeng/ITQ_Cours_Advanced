package lesson_02_inner_class;

public class ClassMainString {
    public static void main(String[] args) {
        StringWrapper stringWrapper = new StringWrapper("Hello");

        for (Character c : stringWrapper) {
            System.out.println(c);
            for (Character d : stringWrapper) {
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
