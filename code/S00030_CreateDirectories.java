import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class S00030_CreateDirectories {

    public static void main(String[] args) throws IOException {
        var path = Path.of("D:\\Workspace\\java-snippets-adam");
        Files.createDirectories(path);
    }
}