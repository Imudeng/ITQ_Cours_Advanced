package lesson_12_liambda_functioin.sample_06;
// обобщенные интерфейсы
public class Main {
    public static void main (String[] args) {
        Modificator<String> mod = (text) -> text.toUpperCase();
        System.out.println(mod.modification("hello"));
    }
}
