import java.io.Console;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class S00040_TimeVSChronoUnit {

    public static void main(String... args) throws InterruptedException {
        System.out.println("what's the difference?");
        var tu = TimeUnit.SECONDS;
        System.out.println(tu);
        tu.sleep(2);
        var cu = ChronoUnit.SECONDS;
       System.out.println(cu);
    }
}
