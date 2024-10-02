package lesson_03_static_nested_class;

public class OuterClassWitchPrivate {
    private String text;
    private static int number =10;

    public OuterClassWitchPrivate(String text) {
        this.text = text;
    }

    public static class NestedClas {
        private static String word;

        public NestedClas(String word) {
            this.word = word;
        }

        public static void printText(OuterClassWitchPrivate ocwp) {
            System.out.println(word + " " + number + ocwp.text);
        }
        public void methodName() {
            extracted();     }
            }

    private static void extracted() {
        System.out.println("Hallo World");
    }
}
