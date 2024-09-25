package lesson_09_default_methods.third_sample;

public class C extends RealizationA implements B {
    private String text;

    public C(String text) {
        super(text);
        this.text = text;
    }

    @Override
    public String toString() {
        return "C [text=" + text +"]";
    }
}
