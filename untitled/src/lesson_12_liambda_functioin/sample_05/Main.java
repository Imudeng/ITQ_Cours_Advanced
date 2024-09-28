package lesson_12_liambda_functioin.sample_05;
// использование лямбда функции в методе
public class Main {
    public static void main(String[] args) {
        Summator summator = getIntegerSummator(new int[] {1,2,3});
        System.out.println(summator.getSum());
    }

    public static Summator getIntegerSummator(int[] array) {
        Summator summator =() -> {
            int sumamtor = 0;
            for (int i=0; i< array.length; i++) {
                sumamtor +=array[i];
            }
            return sumamtor;
        };
        return summator;
    }
}
