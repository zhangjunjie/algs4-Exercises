//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.20
 */
public class Chap1E1120 {
    public static double ln(int N)
    {
        if(N == 1) return 0;
        
        return Math.log(N) + ln(N-1);
    }

    public static void main(String[] args) {
        int N = 100;
        double ret = ln(N);
        StdOut.println(N + " " + ret);
    }
}