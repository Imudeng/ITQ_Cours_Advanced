package functional_intefaces.lesson_11_functional_interfaces.sample_07;

@FunctionalInterface
public interface IntElementGenerator {
    public Integer next(Integer current);
}
