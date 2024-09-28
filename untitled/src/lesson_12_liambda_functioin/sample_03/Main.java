package lesson_12_liambda_functioin.sample_03;

public class Main {
    public static void main (String[] args) {
        SimpleClass simpleClass = new SimpleClass(new int[]{1,2,3,4});
        Summator summator = simpleClass.getSummatorInstance();
        System.out.println(summator.getSum());
    }
}
