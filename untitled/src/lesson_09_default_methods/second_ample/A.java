package lesson_09_default_methods.second_ample;

public interface A {
    public default String getMessage() {
        return "Hello World";
    }
}
