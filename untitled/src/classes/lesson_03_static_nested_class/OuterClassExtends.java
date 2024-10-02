package lesson_03_static_nested_class;

public class OuterClassExtends {
    private String text;
    private static int number = 10;

    public OuterClassExtends(String text0) {
        this.text = text;
    }

    public class InnerClass {
        private int pages = 10;
    }

    public static class SuperNestedCLass {
        private String autor = "Bob";
    }

    public static class NestedClass extends SuperNestedCLass {
        private String word;

        public NestedClass(String word) {
            this.word = word;
        }
    }
}
