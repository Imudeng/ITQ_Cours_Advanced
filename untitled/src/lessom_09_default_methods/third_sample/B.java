package lessom_09_default_methods.third_sample;

public interface B {
    public default String getMessage() {
        return "Hello Java";
    }
}
