package lesson_11_functional_interfaces.saple_one;

import java.util.NoSuchElementException;

@FunctionalInterface
public interface Generator <T>{
    public T getNext();
    public boolean equals(Object object);

    public default void stopGeneration() {
        throw new NoSuchElementException();
    }
}
