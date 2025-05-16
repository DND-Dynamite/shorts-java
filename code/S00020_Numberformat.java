import java.text.NumberFormat;

public class S00020_Numberformat {

    public static void main(String[] args) {
        var number = 10000;
        var f = NumberFormat.getCompactNumberInstance();
        var result = f.format(number);
        System.out.println(result);

    }
}
