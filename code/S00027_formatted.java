public class S00027_formatted {

    public static void main(String[] args) {
        var message = """
        hey, %s. You are older than %d
        """.formatted("duke",18);
        System.out.println(message);
    }
}
