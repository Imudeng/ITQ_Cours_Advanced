public final class ImmutablePointOne {
    private final double x;// 1 пункт
    private final double y;

    public ImmutablePointOne(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePointOne() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Immuatable [x=" + x+",y="+y+"]";
    }
}
