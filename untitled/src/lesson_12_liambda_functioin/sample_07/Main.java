package lesson_12_liambda_functioin.sample_07;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

// исключения
public class Main {
    public static void main (String[] args){
        Saver saver = (obj) -> {
            File file = new File("save.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(obj.toString());
            printWriter.close();
        };
        try {
            saver.save("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
