package lesson_09_default_methods.second_ample;

public class C implements B {
    private String text;

    public C(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "C [text=" + text +"]";
    }
}
