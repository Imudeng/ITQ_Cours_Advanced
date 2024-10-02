package lesson_02_inner_class;

public class Main2 {
    public static void main(String[] args) {
        Letter l = new Letter("Alexander");
        Letter.Address addr = l.new Address(1);
        System.out.println(addr.getLetterSender());
        System.out.println(addr);
    }
}
