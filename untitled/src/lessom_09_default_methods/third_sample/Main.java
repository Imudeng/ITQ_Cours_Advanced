package lessom_09_default_methods.third_sample;

public class Main {
    public static void main(String[] args){
        C c =new C("Hello");

        A interfaceA = c;
        B interfaceB = c;

        System.out.println(c.getMessage());
        System.out.println(interfaceA.getMessage());
        System.out.println(interfaceB.getMessage());
        System.out.println(c.toString());

    }
}
