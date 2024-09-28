package lesson_12_liambda_functioin.sample_03;
// доступ к внешним данным из лямбда функции
public class SimpleClass {
    private int[] arr;

    private Summator summator = () -> {
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    };

    public SimpleClass(int[] arr) {
        super();
        this.arr = arr;
    }
    public Summator getSummatorInstance() {
        return this.summator;
    }
}
