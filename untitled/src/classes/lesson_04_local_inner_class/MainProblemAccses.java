package lesson_04_local_inner_class;

public class MainProblemAccses {
    public static void main(String[] args) {
        OuterClassProblemAccess outerClassProblemAccess = new OuterClassProblemAccess();
        System.out.println(outerClassProblemAccess.getLengComparator().compare("Hi","Bye"));
    }
}
