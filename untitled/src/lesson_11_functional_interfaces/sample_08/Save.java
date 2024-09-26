package lesson_11_functional_interfaces.sample_08;

import java.io.IOException;

@FunctionalInterface
public interface Save<T> {
    public void saveTo(T element) throws IOException;
}
