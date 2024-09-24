package lesson_05_anonymos_inner_class;

import java.util.Comparator;

public class OuterClassWitchAnonymos {
    private String text;

    public Comparable<String> comparable = new Comparable<String>() {
        @Override
        public int compareTo(String s) {
            return OuterClassWitchAnonymos.this.text.compareTo(s);// здесь показана возможность обращения к конкретным полям внешнего класса так как у анонимного класса могут быть свои поля
        }
    };
    public OuterClassWitchAnonymos(String text) {
        this.text = text;
    }
}
