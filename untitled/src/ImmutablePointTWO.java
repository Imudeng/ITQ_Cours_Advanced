public final class ImmutablePointTWO {
    private final double x;// 1 пункт
    private final double y;

    public ImmutablePointTWO(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePointTWO() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public ImmutablePointTWO setX (double x) {
    return new ImmutablePointTWO(x,y);}
    public ImmutablePointTWO setY (double y) {
        return new ImmutablePointTWO(x,y);
    }

    @Override
    public String toString() {
        return "Immuatable [x=" + x+",y="+y+"]";
    }
}



