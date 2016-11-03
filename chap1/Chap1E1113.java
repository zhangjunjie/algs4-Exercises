//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.13
 */
public class Chap1E1113 {
    public static void main(String[] args) {
        int M = 3, N = 4;
        int[][] mat = new int[M][N];
        for(int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                mat[i][j]= i+j;
            }
        }
//orig mat
        for(int i = 0; i < M; i++)
        {
            for(int j = 0; j < N; j++)
            {
                StdOut.printf(Integer.toString(mat[i][j]));
            }
                StdOut.println("");
        }
        StdOut.println("");
// trans mat
        for(int j = 0; j < N; j++)
        {
            for(int i = M-1; i >= 0; i--)
            {
                StdOut.printf(Integer.toString(mat[i][j]));
            }
                StdOut.println("");
        }        
    }
}