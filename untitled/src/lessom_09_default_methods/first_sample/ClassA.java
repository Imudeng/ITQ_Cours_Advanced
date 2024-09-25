package lessom_09_default_methods.first_sample;

public class ClassA implements SampleInterface {
    private String message;

    public ClassA(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public String toString() {
        return "ClassA [message=" + message + "]";
    }
}
