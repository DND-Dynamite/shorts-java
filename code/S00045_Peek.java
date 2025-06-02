import java.util.stream.IntStream;

interface S00045_Peek {

    static void main(String ...args) {
        var arr = IntStream.range(0, 12).filter(x -> x % 2 == 0).peek(System.out::println).toArray();
    }
}
