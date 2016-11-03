//import java.util.Arrays;
//import java.util.Scanner;
/**
 * Exercises 1.1.11
 */
public class Chap1E1111 {
    public static void main(String[] args) {
        int rows = 10, columns = 2;
        boolean rendered[][] = new boolean[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(j%2 == 0)
                    rendered[i][j] = false;
                else
                    rendered[i][j] = true;
            }
        }
      
        StdOut.printf(" ");
      
        for(int i = 0; i < columns; i++)
        {
            StdOut.printf(Integer.toString(i));
        }
        StdOut.println("");

        for(int i = 0; i < rows; i++)
        {
            StdOut.printf(Integer.toString(i));
            for(int j = 0; j < columns; j++)
            {
                if(rendered[i][j] == true)
                {
                    StdOut.printf("*");
                }else{
                    StdOut.printf(" ");
                }    
            }
            StdOut.println("");
        }
    }
}