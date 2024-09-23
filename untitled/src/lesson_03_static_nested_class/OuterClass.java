package lesson_03_static_nested_class;

public class OuterClass {
    private String text;
    private static int number = 10;

    public OuterClass(String text) {
        this.text = text;
    }
// объявлениее статического вложенного класса */
    public static class NestedClass {
        private String word;

        public NestedClass(String word) {
            this.word = word;
        }

        public void printText() {
            System.out.println(word + " " + OuterClass.number);// доступ к privat статическому полю внешнего класса
        }
    }
}


