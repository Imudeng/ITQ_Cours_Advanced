package lesson_03_static_nested_class;

public class MainWitchPrivateMain {
    public static void main(String[] args) {
        OuterClassWitchPrivate ocwp = new OuterClassWitchPrivate(" Word");
        OuterClassWitchPrivate.NestedClas on = new OuterClassWitchPrivate.NestedClas("Hello");
        OuterClassWitchPrivate.NestedClas.printText(ocwp);
    }
}

