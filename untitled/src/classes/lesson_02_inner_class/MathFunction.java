package lesson_02_inner_class;

public class MathFunction {
    private class Square extends Function1 {

        @Override
        public int function(int n) {
            return n * n;
        }
    }

    private class Cube extends Function1 {


        @Override
        public int function(int n) {
            return n * n * n;
        }
    }

    public Function1 getSqare() {
        return new Square();
    }

    public Function1 getCube() {
        return new Cube();
    }
}
