package lesson_05_anonymos_inner_class;

public class Main {
    public static void main (String[] args) {
        Cat cat1 = new Cat("Vaska");
        System.out.println(cat1);
        System.out.println(cat1.getVoice());

        Cat cat2 = new Cat() {
            @Override
            public String getVoice() {
                return "woof";
                }
            };
        System.out.println(cat2);
        System.out.println(cat2.getVoice());
    }
}
