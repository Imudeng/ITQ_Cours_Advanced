package lesson_02_inner_class;

public class MathFunction {
    private class Square extends Function {

        @Override
        public int function(int n) {
            return n * n;
        }
    }

    private class Cube extends Function {


        @Override
        public int function(int n) {
            return n * n * n;
        }
    }

    public Function getSqare() {
        return new Square();
    }

    public Function getCube() {
        return new Cube();
    }
}
