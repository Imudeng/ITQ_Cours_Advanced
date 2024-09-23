package lesson_03_static_nested_class;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass on = new OuterClass.NestedClass("Hello");
        on.printText();
    }
}
