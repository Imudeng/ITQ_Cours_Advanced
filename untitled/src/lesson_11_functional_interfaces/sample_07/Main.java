package lesson_11_functional_interfaces.sample_07;



public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();
        IntElementGenerator intElementGenerator = gen::nextElement;
}
}
