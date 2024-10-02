package lesson_05_anonymos_inner_class;

public class OuterClassWitchAddVariables {
    private String text;

    public Comparable<String> comparable = new Comparable<String>() {
        public int direction = 1;
        @Override
        public int compareTo(String o) {
            return (OuterClassWitchAddVariables.this.text.length()-o.length())*direction;
        }
    };

    public OuterClassWitchAddVariables(String text) {
        this.text = text;
    }
    public int compareLength (String text) {
        //int integer = comparable.direction; / будет ошибка так как находиться за пределами внешнего класса во внутреннем
        return comparable.compareTo(text);
    }
}
