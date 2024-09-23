package lesson_02_inner_class;

public class MainMathFunction {
    public static void main(String[] args) {
        MathFunction mathFunction = new MathFunction();

        System.out.println(calculate(mathFunction.getSqare(),1,4));
        System.out.println(calculate(mathFunction.getCube(),1,4));
    }
    public static int calculate(Function fun, int begin, int end) {
        return fun.calculation(begin,end);
    }
}
