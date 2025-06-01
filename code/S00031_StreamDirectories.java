import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class S00031_StreamDirectories {

    static void createDirectories() throws IOException {
        for (int i = 0; i < 10; i++) {
            Files.createDirectories(Path.of("./directory_" + i));
        }

    }

    public static void main(String[] args) throws IOException {
        createDirectories();
        var root = Path.of(".");
        Files.newDirectoryStream(root)
                .forEach(System.out::println);
    }
}
