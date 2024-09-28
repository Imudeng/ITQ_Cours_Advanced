package lesson_12_liambda_functioin.sample_01;

public class Main {
    public static void main(String[] args) {
        StringModificator stringModificator = text -> text.toUpperCase();
        System.out.println(stringModificator.getString("Hello"));
    }
}
