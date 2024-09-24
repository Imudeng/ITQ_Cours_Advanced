package lesson_04_local_inner_class;

public class Main {
    public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.getLengtComparator().compare("Hello", "Wow"));
    }
}
