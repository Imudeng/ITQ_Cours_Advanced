package lesson_05_anonymos_inner_class;

public class AnonymosClassName {
    private String text;

    public Comparable<String> comparable = new Comparable<String>() {
        public int direction;
// не статический блок инициализации, решает проблему отсуствуия конструкторов.
// если в теле описать(любого класса) без идентификатора, просто {}, то содержимое будет выполнено при создании объекта
        {
            direction =1;
        }

        @Override
        public int compareTo(String o) {
            return (AnonymosClassName.this.text.length() - o.length()) * direction;
        }
    };

    public AnonymosClassName(String text) {
        this.text = text;
    }

    public int compareLength(String text) {
        //int integer = comparable.direction; / будет ошибка так как находиться за пределами внешнего класса во внутреннем
        return comparable.compareTo(text);
    }
}

