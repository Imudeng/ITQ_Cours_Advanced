package lesson_03_static_nested_class;

public class OuterClassWitchPrivate {
    private String text;
    private static int number =10;

    public OuterClassWitchPrivate(String text) {
        this.text = text;
    }

    public static class NestedClas {
        private String word;

        public NestedClas(String word) {
            this.word = word;
        }

        public void printText(OuterClassWitchPrivate ocwp) {
            System.out.println(word + " " + number + ocwp.text);
        }

    }
}
