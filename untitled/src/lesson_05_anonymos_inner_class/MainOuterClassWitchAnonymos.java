package lesson_05_anonymos_inner_class;

public class MainOuterClassWitchAnonymos {
    public static void main(String[] args) {
        OuterClassWitchAnonymos outerClassWitchAnonymos = new OuterClassWitchAnonymos("Cat");
        System.out.println(outerClassWitchAnonymos.comparable.compareTo("Hello"));
    }
}
