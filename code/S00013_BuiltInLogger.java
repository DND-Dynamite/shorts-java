import java.lang.System.Logger.Level;

/* refer obsidian for markdown */
public class S00013_BuiltInLogger {

    public static void main(String[] args) {
        var log = System.getLogger("duke");
        log.log(Level.INFO, "hello, world");
        System.out.println("adf");
        log.log(Level.ERROR, "hello, world");
    }
    
}
