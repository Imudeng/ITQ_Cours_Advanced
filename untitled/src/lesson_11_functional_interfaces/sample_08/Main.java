package lesson_11_functional_interfaces.sample_08;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Save<String> save = Main::saveToFile;
        try {
            save.saveTo("HelloWorld");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> void saveToFile(T el) throws IOException{
        PrintWriter printWriter = new PrintWriter(new File("save.txt"));
        printWriter.println(el);
    }
}
