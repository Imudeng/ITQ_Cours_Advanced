package lesson_09_default_methods.first_sample;

public class Main {
    public static void main(String[] args) {
        SampleInterface a = new ClassA("Hello");
        SampleInterface b = new ClassB("Hello");

        System.out.println(a.getMessage());
        System.out.println(b.getMessage());
    }
}
