package functional_intefaces.lesson_20_unary_operation.primitive;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        IntUnaryOperator un1 = Main:: factorial;
        System.out.println(un1.applyAsInt(5));
    }

    public static int factorial (int n) {
        int result = 1;
        for( int i=1; i<=n; i++){
            result *=i;
        }
        return result;
    }
}
