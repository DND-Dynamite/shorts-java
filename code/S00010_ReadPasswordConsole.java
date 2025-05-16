
import java.io.Console;

public class S00010_ReadPasswordConsole {
    
    public static void main(String[] args) {
        Console console = System.console();
        char[] chars = console.readPassword();
        System.out.println(chars);
    }
}
