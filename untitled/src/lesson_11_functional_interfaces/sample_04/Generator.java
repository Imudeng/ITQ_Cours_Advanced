package lesson_11_functional_interfaces.sample_04;

@FunctionalInterface
public interface Generator {
    public int getNextElement(IntGenerator generator);

}

