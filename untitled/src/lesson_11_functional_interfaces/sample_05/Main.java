package lesson_11_functional_interfaces.sample_05;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Generator generator;
        generator = ArrayList::new;
        Object object = generator.createNewObject();
        System.out.println(object.getClass());

    }
}
