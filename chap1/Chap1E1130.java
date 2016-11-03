//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.30
 */
public class Chap1E1130 {
    public static int gcd(int p, int q)
    {
        if(q == 0) return p;
        return gcd(q, p%q);
    }
    
    public static void main(String[] args) {
        int m, n;
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        Boolean[][] mat = new Boolean[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if( i == 0 || j == 0 || gcd(i, j) == 1)
                {
                    mat[i][j] = true;
                }else{
                    mat[i][j] = false;
                }
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(mat[i][j] == true){
                    StdOut.printf("T");
                }else{
                    StdOut.printf("F");
                }    
            }
            StdOut.println();
        }
    }
}