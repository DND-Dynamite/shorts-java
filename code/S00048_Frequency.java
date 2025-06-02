import java.util.Collections;
import java.util.List;

interface S00048_Frequency {

    static void main(String... args) {
        var numbers = List.of(1,2,2,2,3,3,3);
        var freq = Collections.frequency(numbers, 2);
        System.out.println(freq);
    }
}
