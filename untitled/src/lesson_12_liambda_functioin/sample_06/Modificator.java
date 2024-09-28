package lesson_12_liambda_functioin.sample_06;
@FunctionalInterface
public interface Modificator<T> {
    public T modification(T element);
}
