package lesson_05_anonymos_inner_class;

public class MainAnonymosClassName {
    public static void main (String[] args) {
        AnonymosClassName anonymosClassName = new AnonymosClassName("Cat");
        System.out.println(anonymosClassName.comparable.getClass().getName());
    }
}
