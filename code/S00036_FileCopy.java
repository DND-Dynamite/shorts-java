import java.nio.file.Files;
import static java.nio.file.Path.*;
import java.io.IOException;

interface S00036_FileCopy {

    static void main(String... args) throws IOException {
        Files.copy(of("S0001_InsertionSort.java"), of("App.next"));
    }
}
