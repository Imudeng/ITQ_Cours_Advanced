package lesson_11_functional_interfaces.sample_02;

public class Main {
    public static void main(String[] args) {
        SimpleGen simpleGen = new SimpleGen(5);
        Generator generator = simpleGen::getNumber;
        int temp = generator.getNextElement();
        System.out.println(temp);
    }
}
