import java.util.Timer;
import java.util.TimerTask;

class S0003_Timer {

    public static void main(String[] args) {
        var task = new TimerTask() {

            public void run() {
                System.out.println("working");
            }
        };

        var timer = new Timer();
        timer.schedule(task, 0, 1000);

    }
}