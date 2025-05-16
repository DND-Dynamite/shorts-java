
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

interface S0004_ScheduledThreadPool {

    public static void main(String[] args) {
        var scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> System.out.println("hello, world...!"), 0, 1000, TimeUnit.SECONDS);

        // Consumer<String> consumer = (c) -> System.err.println(c);
        // Supplier<String> supplier = () ->  "hello world";
    }

     

}
