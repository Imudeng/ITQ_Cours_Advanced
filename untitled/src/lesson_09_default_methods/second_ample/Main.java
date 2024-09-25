package lesson_09_default_methods.second_ample;

public class Main {
    public static void main(String[] args){
        C c =new C("Hello");

        A interfaceA = c;
        B interfaceB = c;

        System.out.println(c.getMessage());
        System.out.println(interfaceA.getMessage());
        System.out.println(interfaceB.getMessage());

    }
}
