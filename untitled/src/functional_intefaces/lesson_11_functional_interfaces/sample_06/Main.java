package functional_intefaces.lesson_11_functional_interfaces.sample_06;

public class Main {
    public static void main(String[] args) {
    NumbGenerator numbGenerator = new NumbGenerator();
    Modifier<Integer> x = numbGenerator::add;
    Modifier<String> y = numbGenerator::add;
}
}
