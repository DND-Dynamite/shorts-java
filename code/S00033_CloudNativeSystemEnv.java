public class S00033_CloudNativeSystemEnv {

    public static void main(String[] args) {
        var home = System.getenv().get("JAVA_HOME");
        System.out.println(home);
    }
}
