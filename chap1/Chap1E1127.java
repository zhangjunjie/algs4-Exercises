//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.27
 */
public class Chap1E1127 {
    public static double binomial(int N, int K, double p)
    {
       double[][] binomial = new double[N+1][K+1];
      for (int k = 1; k <= K; k++) binomial[0][k] = 0;
      binomial[0][0] = 1;
      for (int n = 1; n <= N; n++) binomial[n][0] = (1-p)*binomial[n-1][0];

      for (int n = 1; n <= N; n++)
          for (int k = 1; k <= K; k++)
          binomial[n][k] = p*binomial[n-1][k-1] + (1-p)*binomial[n-1][k];

       return binomial[N][K];
    }

    public static double binomial_r(int N, int K, double p)
    {
        if((N == 0) && (K == 0))  return 1.0;
        if((N < 0) || (K < 0))  return 0.0;
        
        return (1-p)*binomial_r(N-1, K, p) + p*binomial_r(N-1, K-1, p);

    }

    public static void main(String[] args) {
        int N = 10, k = 3;
        double p = 0.25;
        
        StdOut.println(" " + binomial(N, k, p));
        StdOut.println(" " + binomial_r(N, k, p));
    }
}