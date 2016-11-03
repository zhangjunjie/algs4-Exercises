//import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.35
 */
public class Chap1E1135 {

    public static void main(String[] args) {
     int N = 0;                     
     double espi = 0.001;
     //cal the exact probability
     int SIDES = 6, match=0;
        double[] dist = new double[2*SIDES+1];
        for(int i = 1; i <= SIDES; i++)
            for(int j = 1; j <= SIDES; j++)
                dist[i+j] += 1.0;
        
        for(int k = 2; k <= 2*SIDES; k++)
            dist[k] /= 36.0;
        
        // initialize counters
        double[] rolls = new double[2*SIDES+1];

        while(N >= 0)
        {
            // flip dice
            match = 0;
            int result_1 = StdRandom.uniform(1, SIDES+1);
            int result_2 = StdRandom.uniform(1, SIDES+1);
            rolls[result_1+result_2] += 1.0;
            N++;
            for (int i = 2; i <= 2*SIDES; i++) {
 //               if(Math.abs((rolls[i]/N) - dist[i]) <= espi)
                  if((rolls[i]/N) == dist[i])
                    match += 1;
            }
            if(match >= 4)
                break;
        }
        StdOut.printf("after %d times\n", N);
        
        for (int i = 2; i <= 2*SIDES; i++) {
               StdOut.printf("%d %.4f %.4f\n ",i, rolls[i]/N, dist[i]);
        }
        
    }
}