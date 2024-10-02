package functional_intefaces.lesson_11_functional_interfaces.sample_04;

public class Main {
    public static void main(String[] args) {
        IntGenerator a = new IntGenerator();
        Generator generator = IntGenerator::next;
        System.out.println(generator.getNextElement(a));
    }
}
