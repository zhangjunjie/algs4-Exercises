//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.19
 */
public class Chap1E1119 {
    public static long F(int N)
    {
        if(N == 0) return 0;
        if(N == 1) return 1;

        long[] ret= new long[N+1];
        ret[0] = 0;
        ret[1]= 1;
        for(int i = 2; i <= N; i++)
            ret[i] = ret[i-1] + ret[i-2];
        return ret[N];
    }

    public static void main(String[] args) {
        for(int N = 0; N < 100; N++)
            StdOut.println(N + " " +F(N));
    }
}