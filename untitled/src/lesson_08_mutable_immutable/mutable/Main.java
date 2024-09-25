package lesson_08_mutable_immutable.mutable;

public class Main {
    public static void main(String[] args) {
        MutablePoint mutablePoint = new MutablePoint(1,1);
        System.out.println(mutablePoint);
        mutablePoint.setX(3);
        System.out.println(mutablePoint);
    }
}
