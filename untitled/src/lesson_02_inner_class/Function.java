package lesson_02_inner_class;

public abstract class Function {
    public abstract int function(int n);

    public int calculation (int begin, int end) {
        return function(end) - function(begin);
    }

}
