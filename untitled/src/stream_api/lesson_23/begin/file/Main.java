package stream_api.lesson_23.begin.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try {
            Optional<String> result = Files.lines(Path.of("cat name.txt")).max((a,b) -> a.length() - b.length());
            System.out.println(result.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
