import java.time.LocalDateTime;
import java.util.Objects;

public class S0026_ObjectsPreconditions {
    
     static String error() {
        return "input please now: " + LocalDateTime.now();
    }

    static void parameterPlease(String input) {
        Objects.requireNonNull(input, S0026_ObjectsPreconditions::error);
    }

    public static void main(String[] args) {
        parameterPlease(null);
    }
}

/*
    Why it's great:

    Lazy evaluation: The error() method is only called if the input is null.

    Custom message: You get a detailed error with a timestamp.

    Readable and clean: Method references make it elegant.

 */