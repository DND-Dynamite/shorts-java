
import java.util.Arrays;

class S0002_AsymptoticAnalysis {

    void prefixAverages(int[] n) {

        int[] avg = new int[n.length];
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += n[j];
            }
            avg[i] = sum / i + 1;
        }

        Arrays.toString(avg);
    }
}