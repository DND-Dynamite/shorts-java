import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;

interface S00046_DownloadURLContentToFile {

    static void main(String[] args) throws IOException {
        var url = URI.create("https://airhacks.industries").toURL();
        var path = Path.of("content.html");
        try(var is = url.openStream()){
            Files.copy(is,path);
        }
    }
}
