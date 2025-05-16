public class S00025_Runnable {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("working");
        new Thread(r).start();
    }
}
