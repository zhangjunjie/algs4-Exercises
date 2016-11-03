//import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.37
 */
public class Chap1E1137 {

    public static void myshuffle(int[] a)
    {
        int N = a.length;
        for(int i = 0; i < N; i++)
        {
            int r = StdRandom.uniform(N);
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    
    public static void main(String[] args) {
     int M = Integer.parseInt(args[0]);                     
     int N = Integer.parseInt(args[1]);                     
     int[] arr = new int[M];
     int[][] freq = new int[M][M];
     for(int f = 0; f < N; f++){
         for(int i = 0; i < M; i++)
         {
             arr[i] = i;
         }
         StdRandom.shuffle(arr);
         for(int i = 0; i < M; i++)
         {
             freq[arr[i]][i]++;
         }
     }
     for(int i = 0; i < M; i++){
         for(int j = 0; j < M; j++)
         {
             StdOut.printf("%d ", freq[i][j]);
         }
         StdOut.println();
     }
              StdOut.println();
     for(int i = 0; i < M; i++){
         for(int j = 0; j < M; j++)
         {
             freq[i][j] = 0;
         }
     }
     for(int f = 0; f < N; f++){
         for(int i = 0; i < M; i++)
         {
             arr[i] = i;
         }
         myshuffle(arr);
         for(int i = 0; i < M; i++)
         {
             freq[arr[i]][i]++;
         }
     }
     for(int i = 0; i < M; i++){
         for(int j = 0; j < M; j++)
         {
             StdOut.printf("%d ", freq[i][j]);
         }
         StdOut.println();
     }
    }
}