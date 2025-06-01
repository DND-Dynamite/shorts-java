//import java.io.FileNotFoundException;
//import java.io.PrintStream;
//
//public class S00039_SouthRedirect {
//
//    public static void main(String[] args) {
//        try {
//            PrintStream ps = new PrintStream("log.file");
//            System.setOut(ps);
//            System.out.println("hello, duke");
//        }  catch (FileNotFoundException e) {
//            System.err.println("Error: Could not create log file.");
//            e.printStackTrace();
//        }
//    }
//}
