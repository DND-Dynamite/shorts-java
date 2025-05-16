public class S00021_UnderscoresInNumbers {

    public static void main(String[] args) {
        var number = 10_000_000;
        System.out.println(number);
        var white = 0xff_ff_ff;
        System.out.println(white);
    }

    /*
     * 10_000_000 is a valid integer literal using underscores for readability. The underscores are ignored by the compiler.
     *  0xff_ff_ff is a hexadecimal literal for white color in RGB (hex: ffffff = decimal 16777215).
     *
     */

}