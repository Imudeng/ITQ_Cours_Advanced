package lesson_18_var_variable.for_each;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] {"Hello"," World"};
        for (var element : array) {
            System.out.println(element);
        }
    }
}
