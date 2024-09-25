package lesson_10_privat_methods.not_static;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
public interface Logger {
    public default void writeErrorMessage (String message) throws IOException {
        message += new Date() + message;
        File file = new File("Errors.CSV");
        writeToCSVFile(file, message);
    }

    public default void writeWarningMessage (String message) throws IOException {
        message += new Date() + message;
        File file = new File("Warnings.CSV");
        writeToCSVFile(file, message);
    }

    private void writeToCSVFile (File file, String message) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file, true))) {
            printWriter.print(message + ";");
        }  catch (IOException e){
            throw e;
        }
    }
}
**/
