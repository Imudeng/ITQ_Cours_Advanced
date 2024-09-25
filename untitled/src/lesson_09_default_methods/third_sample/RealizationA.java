package lesson_09_default_methods.third_sample;

public class RealizationA implements A {

    public RealizationA() {
        this.text = "Default text";
    }

    private String text;

        public RealizationA(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text+" "+text;
    }

    @Override
    public String toString() {
        return "C[text" +text+"]";
    }
}
