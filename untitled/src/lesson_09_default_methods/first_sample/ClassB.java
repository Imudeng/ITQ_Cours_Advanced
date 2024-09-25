package lesson_09_default_methods.first_sample;

public class ClassB implements SampleInterface {
    private String message;

    public ClassB(String message) {
        this.message = message;
    }

    public String toString() {
        return "ClassB [message=" + message + "]";
    }
}
