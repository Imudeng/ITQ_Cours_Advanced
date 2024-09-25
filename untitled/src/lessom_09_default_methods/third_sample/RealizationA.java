package lessom_09_default_methods.third_sample;

public class RealizationA {
    private String text;
    public RealizationA() {
        this.text= "Default text";
    }
    public RealizationA(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text+" "+text;
    }

    @Override
    public String toString() {
        return "C[text" +text+"]"
    }
}
