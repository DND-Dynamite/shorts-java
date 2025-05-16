
import java.nio.file.Files;
import java.nio.file.Path;

class S0006_FileDiff {

    public static void main(String[] args) throws Exception {
        var first = Path.of("first.txt");
        var second = Path.of("second.txt");

        Long firstDifferenceByte = Files.mismatch(first, second);
        System.out.println(firstDifferenceByte);
    }
}