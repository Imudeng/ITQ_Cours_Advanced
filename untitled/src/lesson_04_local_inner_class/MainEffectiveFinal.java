package lesson_04_local_inner_class;

public class MainEffectiveFinal {
    public static void main(String[] args) {
        OuterClassEffiectiveFinal outerClassEffiectiveFinal = new OuterClassEffiectiveFinal();
        System.out.println(outerClassEffiectiveFinal.getLengtComparator().compare("Pain","Misery"));
    }
}
