//import java.util.Arrays;
import java.lang.String;
/**
 * Exercises 1.1.36
 */
public class Chap1E1136 {

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
    }
}