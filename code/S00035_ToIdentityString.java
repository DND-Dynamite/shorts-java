import static java.lang.System.out;
import java.time.LocalDate;
import java.util.Objects;

interface S00035_ToIdentityString {

    static void main(String... args) {
        var msg = LocalDate.now();
        out.println(Objects.toIdentityString(msg));
    }
}