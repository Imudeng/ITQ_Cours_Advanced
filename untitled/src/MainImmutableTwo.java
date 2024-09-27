public class MainImmutableTwo {
    public static void main(String[] args) {
        ImmutablePointTWO immutablePoint = new ImmutablePointTWO(2, 4);
        ImmutablePointTWO immutablePointTWO = immutablePoint.setX(1);
        System.out.println(immutablePoint);
        System.out.println(immutablePointTWO);

        System.out.println(immutablePoint == immutablePointTWO);
    }
}


