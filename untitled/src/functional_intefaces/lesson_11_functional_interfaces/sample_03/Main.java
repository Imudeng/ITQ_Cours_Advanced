package functional_intefaces.lesson_11_functional_interfaces.sample_03;

public class Main {
    public static void main(String[] args) {
        Generator generator = SimpleGen::getRandomNumber;
        int temp = generator.getNextElement();
        System.out.println(temp);
    }
}
