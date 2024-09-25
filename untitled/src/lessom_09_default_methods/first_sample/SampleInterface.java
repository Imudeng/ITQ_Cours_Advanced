package lessom_09_default_methods.first_sample;

public interface SampleInterface {
    public default String getMessage() {
        return "Default message";
    }
}
