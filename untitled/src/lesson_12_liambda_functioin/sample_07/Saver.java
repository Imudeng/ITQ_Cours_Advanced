package lesson_12_liambda_functioin.sample_07;

import java.io.IOException;

@FunctionalInterface
public interface Saver {
    public void save (Object obj) throws IOException;
}
