package lesson_09_default_methods.third_sample;

public interface A {
    public default String getMessage() {
        return "Hello World";
    }
}
