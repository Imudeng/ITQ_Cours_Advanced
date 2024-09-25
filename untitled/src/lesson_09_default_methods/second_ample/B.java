package lesson_09_default_methods.second_ample;

public interface B extends A {
    public default String getMessage() {
        return "Hello Java";
    }
}
